package com.mocloud.user.web.config.rabbitmqtest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Slf4j
@RequestMapping("mq")
@RestController
public class Sender
{

    @Autowired
    private AmqpTemplate amqpTemplate;

    @RequestMapping("/hello")
    public void send()
    {
        String context = "hello " + new Date();
        log.info("mo-cloud-user Sender ==============================: " + context);
        this.amqpTemplate.convertAndSend("hello1", context);
    }





}