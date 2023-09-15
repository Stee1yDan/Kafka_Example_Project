package com.example.kafka_example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaExampleApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(KafkaExampleApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(KafkaTemplate<String,String> template)
//    {
//        return args ->
//        {
//            for (int i = 0; i < 1_000_000_000; i++)
//            {
//                template.send("customTopic", "Hello from Kafka " + i);
//            }
//        };
//    }

}
