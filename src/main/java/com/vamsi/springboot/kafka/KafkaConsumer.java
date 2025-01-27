package com.vamsi.springboot.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	private static final LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
	
	@KafkaListener(topics = "vamsi", groupId = "myGroup")
	public void consume(String message) {
		LOGGER.info(String.format("Message received -> %s", message));
	}
}
