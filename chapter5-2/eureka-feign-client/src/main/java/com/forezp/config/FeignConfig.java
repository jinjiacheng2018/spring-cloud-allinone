package com.forezp.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 *<p> Description: Feign的配置类 </p>
 *<p> Copyright: Copyright(c) 2019/1/4 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2019/1/4 17:14
 */
@Configuration
public class FeignConfig {

    /**
     * 注入名为feignRetryer的Retryer的Bean,Feign在远程调度失败之后会进行重试
     * @return Retryer
     */
    @Bean
    public Retryer feignRetryer(){
        return new Retryer.Default(100,SECONDS.toMillis(1),5);
    }
}
