package com.senyaman.springboot.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    //creating a kafka producer
    public void sendMessage(String message) {
        log.info(String.format("Message sent %s", message));
        kafkaTemplate.send("javaguides", message);
    }
}
