package com.senyaman.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    //creating a kafka topic
    @Bean
    public NewTopic kafkaTopic() {
        return TopicBuilder.name("javaguides")
                .build();
    }
}
