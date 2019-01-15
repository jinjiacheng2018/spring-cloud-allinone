package com.forezp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *<p> Description: Eureka服务的启动类，注意添加@EnableEurekaServer注解 </p>
 *<p> Copyright: Copyright(c) 2019/1/4 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2019/1/4 14:43
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication
{
    
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
    
}
