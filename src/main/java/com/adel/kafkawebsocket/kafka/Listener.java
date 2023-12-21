package com.adel.kafkawebsocket.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import java.util.function.Consumer;

@Configuration
@RequiredArgsConstructor
public class Listener {

    private final SimpMessagingTemplate simpMessagingTemplate;

    @Bean
    public Consumer<Message> inbound() {
        return (pushMessage) -> this.simpMessagingTemplate.convertAndSend("/topic/push-notification", pushMessage);
    }
}
