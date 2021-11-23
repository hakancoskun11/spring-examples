package com.haydikodlayalim.sr;

import com.haydikodlayalim.sr.model.Notification;
import com.haydikodlayalim.sr.producer.NotificationProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RabbitApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitApplication.class,args);

    }
}
