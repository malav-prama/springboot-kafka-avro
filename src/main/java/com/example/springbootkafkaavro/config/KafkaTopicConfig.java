package com.example.springbootkafkaavro.config;

import org.springframework.context.annotation.Configuration;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic avroTopic() {
        return TopicBuilder.name("avroTopic")
                .build();
    }

}
