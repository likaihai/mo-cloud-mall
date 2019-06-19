package com.mocloud.user.web.config.rabbitmqtest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RabbitListener(queues = "hello1")
public class Receiver
{


    @RabbitHandler
    public void process(String hello)
    {
        log.info("my-cloud-user-web-Receiver ===========================: " + hello);
    }

}