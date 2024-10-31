package com.example.kafka_demov2.controller;

import com.example.kafka_demov2.model.User;
import com.example.kafka_demov2.producer.MessageProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaController {

    private final MessageProducer messageProducer;

    @PostMapping
    public String sendMessage(@RequestBody User user){
        messageProducer.sendMessage("mytopic",user);
        return "User sent: " + user.toString();
    }
}
