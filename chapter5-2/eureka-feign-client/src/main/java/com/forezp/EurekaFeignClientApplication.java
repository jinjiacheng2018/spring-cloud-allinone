package com.forezp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 *<p> Description: Feign服务调度，注意添加注解 @EnableEurekaClient，添加@EnableFeignClients注解开启Feign</p>
 *<p> Copyright: Copyright(c) 2019/1/4 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2019/1/4 16:27
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class EurekaFeignClientApplication
{
    
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaFeignClientApplication.class, args);
    }
    
}
