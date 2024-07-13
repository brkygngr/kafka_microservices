package com.brkygngr.kafka_publisher.controller;

import com.brkygngr.kafka_core.event.MessageEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageController {

    private final KafkaTemplate<String, MessageEvent> kafkaTemplate;

    @PostMapping("publish")
    @ResponseStatus(HttpStatus.OK)
    public String publish(@RequestBody MessageEvent messageEvent) {
        kafkaTemplate.send("messages", messageEvent);

        return "Event published successfully!";
    }
}
