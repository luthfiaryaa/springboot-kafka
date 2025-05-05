package com.test.springbootkafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author luthfi aryarizki
 * @decription consumer kafka
 * @date 2025/05/05 10:00
 */

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "my-topic", groupId = "my-group-id")
    public void listen(String message) {
        System.out.println("Received Message: " + message);
    }

}
