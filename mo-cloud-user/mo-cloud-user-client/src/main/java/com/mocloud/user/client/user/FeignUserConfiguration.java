package com.mocloud.user.client.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignUserConfiguration
{

//    @Bean
//    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
//        return new BasicAuthRequestInterceptor("user", "password123");
//    }

//    @Bean
//    public HystrixRoleClientFallback hystrixRoleClientFallback(){
//
//        return new HystrixRoleClientFallback();
//    }

    @Bean
    public UserClientFallbackHystrix userClientFallbackHystrix(){

        return new UserClientFallbackHystrix();
    }







}
