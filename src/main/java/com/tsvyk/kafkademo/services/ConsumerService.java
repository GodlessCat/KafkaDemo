package com.tsvyk.kafkademo.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "messages", groupId = "message_group_id")
    public void consume(String message){
        System.out.println("Consuming the message: " + message);
    }
}
