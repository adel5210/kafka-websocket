package com.adel.kafkawebsocket.kafka;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(BrokerChannel.class)
public class BrokerIntegrationConfig {
}
