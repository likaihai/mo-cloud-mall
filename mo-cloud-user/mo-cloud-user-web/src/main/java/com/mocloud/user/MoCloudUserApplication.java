package com.mocloud.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author likaihai
 * @date 2019/1/21 18:36
 */

@MapperScan("com.mocloud.user.dal.mapper")
@SpringBootApplication
@EnableEurekaClient
@RestController
public class MoCloudUserApplication
{
    public static void main(String[] args) {
        SpringApplication.run(MoCloudUserApplication.class, args);
    }

}
