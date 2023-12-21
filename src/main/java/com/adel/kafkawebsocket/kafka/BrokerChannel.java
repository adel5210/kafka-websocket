package com.adel.kafkawebsocket.kafka;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface BrokerChannel {

    @Input("inbound")
    SubscribableChannel inbound();

}
