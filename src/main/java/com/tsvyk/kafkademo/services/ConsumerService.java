package com.tsvyk.kafkademo.services;

import org.apache.kafka.clients.producer.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private final Logger logger = LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics="my_topic", groupId="my_group_id")
    public void consume(String message){

        logger.info(String.format("#### -> Consumed message -> %s", message));
    }
}
