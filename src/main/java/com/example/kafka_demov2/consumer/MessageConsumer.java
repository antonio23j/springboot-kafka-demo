package com.example.kafka_demov2.consumer;

import com.example.kafka_demov2.model.User;
import com.example.kafka_demov2.repository.KafkaRepository;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MessageConsumer {

    private final KafkaRepository kafkaRepository;

    @KafkaListener(topics = "mytopic", groupId = "my-group-id")
    public void listen(User user){
        kafkaRepository.save(user);
        System.out.println("Received user: "+ user.toString());
    }
}
