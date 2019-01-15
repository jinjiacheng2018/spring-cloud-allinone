package com.foreap.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 *<p> Description: Ribbon的配置类 </p>
 *<p> Copyright: Copyright(c) 2019/1/4 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2019/1/4 15:46
 */
@Configuration
public class RibbonConfig {

    /**
     * 通过配置类获取IOC容器获取RestTemplate类
     * @return RestTemplate
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
