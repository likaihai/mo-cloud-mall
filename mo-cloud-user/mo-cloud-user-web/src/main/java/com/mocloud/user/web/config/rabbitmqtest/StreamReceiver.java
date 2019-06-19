package com.mocloud.user.web.config.rabbitmqtest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.stereotype.Component;

/**
 * 消费者
 * Create by likaihai 2019/1/29
 */
@Component
@EnableBinding(value = {StreamClient.class})
@Slf4j
public class StreamReceiver
{

//    @StreamListener(StreamClient.INPUT)
//    public void receive(String message){
//        log.info("StreamReceiver：{}",message);
//    }

}
