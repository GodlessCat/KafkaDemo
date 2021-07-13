package com.tsvyk.kafkademo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void produce(String message){

        System.out.println("Producing the message: " + message);

        this.kafkaTemplate.send("messages", message);
    }
}
