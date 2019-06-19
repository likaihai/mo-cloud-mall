package com.mocloud.sso.web.config.stream;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.stereotype.Component;

/**
 * Create by likaihai 2019/1/29
 */
@Slf4j
@Component
@EnableBinding
public class StreamReceiver
{

//    @StreamListener("myMessage")
//    public void process(Object message){
//        log.info("StreamReceiver：" + message);
//    }

}
