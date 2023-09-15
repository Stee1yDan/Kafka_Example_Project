package com.example.kafka_example;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners
{
    @KafkaListener(topics = "customTopic", groupId = "customId")
    void listener(String data)
    {
        System.out.println(data);
    }
}
