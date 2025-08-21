package co.duvan.kafka.notification.consumer.handler;

import co.duvan.kafka.core.coremsvc.ProductCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ProductCreatedEventHandler {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @KafkaListener(topics = "product-created-events-topic")
    public void handler(ProductCreatedEvent productCreatedEvent) {

        LOGGER.info("Received a new event {}", productCreatedEvent.getTittle());

    }

}
