package com.logimethods.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;
import java.util.Random;

import com.logimethods.model.Model;


@Component
public class ReplyingKafkaConsumer {
	 
	 @KafkaListener(topics = "${kafka.topic.request-topic}")
	 @SendTo
	  public Model listen(Model request) throws InterruptedException {
		
		 String name = request.getName(); 
		 String[] possibleGreetings = new String[]{"Bonjour", "Hola", "Hello", "Ciao"};
		 String greeting = possibleGreetings[new Random().nextInt(possibleGreetings.length)] + ", "+ name;
		 
		 request.setAdditionalProperty("greeting", greeting);
		 return request;
	  }

}
