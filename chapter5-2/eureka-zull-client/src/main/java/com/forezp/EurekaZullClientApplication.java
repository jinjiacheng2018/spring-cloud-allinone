package com.forezp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 *<p> Description: ZULL的客户端启动类，注意添加@EnableEurekaClient注解,@EnableZuulProxy开启zull功能</p>
 *<p> Copyright: Copyright(c) 2019/1/4 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2019/1/4 15:24
 */
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class EurekaZullClientApplication
{
    
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaZullClientApplication.class, args);
    }
    
}
