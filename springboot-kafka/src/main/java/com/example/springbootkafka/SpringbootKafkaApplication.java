package com.example.springbootkafka;

import com.example.springbootkafka.kafka.MessageSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootKafkaApplication {



    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringbootKafkaApplication.class, args);

        MessageSender sender = context.getBean(MessageSender.class);

        for (int i = 0; i < 3; i++) {
            //调用消息发送类中的消息发送方法
            sender.testSend();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
