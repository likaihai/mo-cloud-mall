package com.mocloud.user.web.config.rabbitmqtest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Create by likaihai 2019/1/29
 */
@RestController
@Slf4j
public class StreamSend
{

//    @Autowired
//    private StreamClient streamClient;

//    @GetMapping("send")
//    public void send(){
////        streamClient.output().send(MessageBuilder.)
//    }

}
