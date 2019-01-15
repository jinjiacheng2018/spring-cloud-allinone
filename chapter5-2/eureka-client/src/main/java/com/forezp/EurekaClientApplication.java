package com.forezp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *<p> Description: Eureka的Client启动动，注意添加@EnableEurekaClient注解 </p>
 *<p> Copyright: Copyright(c) 2019/1/4 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2019/1/4 15:05
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientApplication
{
    
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
    
}
