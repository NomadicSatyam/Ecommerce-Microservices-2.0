package com.crichype.NotificationService;

import com.crichype.NotificationService.config.AppConstants;
import com.crichype.NotificationService.event.OrderPlacedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@Slf4j
public class NotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationServiceApplication.class, args);
	}

	@KafkaListener(topics = AppConstants.NOTIFICATION_UPDATE_TOPIC)
	public void handleNotification(OrderPlacedEvent orderPlacedEvent){

		log.info("Got message <{}>", orderPlacedEvent);
		log.info("Received Notification for Order - {}",orderPlacedEvent.getOrderNumber());

		// Send Out an email notification

	}

}
