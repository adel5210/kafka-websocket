package com.adel.kafkawebsocket.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Listener {

    private final SimpMessagingTemplate simpMessagingTemplate;

    @StreamListener(target = "inbound")
    public void processMessage(final Message pushMessage){
        this.simpMessagingTemplate.convertAndSend("/topic/push-notification", pushMessage);
    }
}
