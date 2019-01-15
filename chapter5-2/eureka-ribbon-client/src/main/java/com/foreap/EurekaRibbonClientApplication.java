package com.foreap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *<p> Description: Ribbon负载均衡启动类，注意添加注解@EnableEurekaClient </p>
 *<p> Copyright: Copyright(c) 2019/1/4 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2019/1/4 15:44
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaRibbonClientApplication
{
    
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaRibbonClientApplication.class, args);
    }
    
}
