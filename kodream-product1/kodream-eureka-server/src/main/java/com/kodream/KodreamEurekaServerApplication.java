package com.kodream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *<p> Description: Eureka的服务端启动类 </p>
 *<p> Copyright: Copyright(c) 2019/1/6 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2019/1/6 12:10
 */
@EnableEurekaServer
@SpringBootApplication
public class KodreamEurekaServerApplication
{
    
    public static void main(String[] args)
    {
        SpringApplication.run(KodreamEurekaServerApplication.class, args);
    }
    
}
