package com.mocloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableZuulProxy
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class MoCloudZuulApplication
{

	public static void main(String[] args) {
		SpringApplication.run(MoCloudZuulApplication.class, args);
	}
}
