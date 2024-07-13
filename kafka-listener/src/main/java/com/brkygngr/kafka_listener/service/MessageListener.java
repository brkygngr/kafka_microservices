package com.brkygngr.kafka_listener.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.brkygngr.kafka_core.event.MessageEvent;

@Service
public class MessageListener {

    @KafkaListener(topics = "messages", groupId = "kafka_listener")
    public void listen(MessageEvent messageEvent) {
        System.out.println("Received message: " + messageEvent.message());
    }
}
