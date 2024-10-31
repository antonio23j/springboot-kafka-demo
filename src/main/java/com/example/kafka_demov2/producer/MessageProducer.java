package com.example.kafka_demov2.producer;

import com.example.kafka_demov2.model.User;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MessageProducer {

    private final KafkaTemplate<String, User> kafkaTemplate;

    public void sendMessage(String topic, User user){
        kafkaTemplate.send(topic, user);
    }

}
