package ru.dgu.dockerproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import ru.dgu.dockerproject.model.User;

@EnableKafka
@SpringBootApplication
public class DockerProjectSpringBootApplication {

    @KafkaListener(topics = "msg")
    public void test(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerProjectSpringBootApplication.class);
    }
}
