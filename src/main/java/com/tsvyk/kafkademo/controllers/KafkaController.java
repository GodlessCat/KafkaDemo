package com.tsvyk.kafkademo.controllers;

import com.tsvyk.kafkademo.services.ProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    private final ProducerService producerService;

    public KafkaController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/publish")
    public void sendMessage(@RequestParam("message") String message) {

        this.producerService.produce(message);

    }
}
