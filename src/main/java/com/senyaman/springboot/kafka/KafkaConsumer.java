package com.senyaman.springboot.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    // creating a kafka consumer
    @KafkaListener(topics = "javaguides", groupId = "myGroup")
    public void consume(String message) {
        log.info(String.format("Message received -> %s", message));
    }
}
