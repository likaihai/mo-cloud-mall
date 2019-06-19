package com.mocloud.sso;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author likaihai
 * @date 2019/1/21 18:36
 */

@MapperScan("com.mocloud.sso.dal.mapper")
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.mocloud.user.client.user")
public class MoCloudSSOApplication
{
    public static void main(String[] args) {
        SpringApplication.run(MoCloudSSOApplication.class, args);
    }
}
