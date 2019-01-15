package com.forezp.controller;

import com.forezp.feign.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    // 自动注入Feign的客户端接口
    @Autowired
    private EurekaClientFeign eurekaClientFeign;

    /**
     * 使用Feign服务调用达到不同服务之间的通信
     *  调用【http://localhost:9053/feignHi】其实转到了eureka-client服务的【http://localhost:9051/hi】接口
     * @param name 名字
     * @return String
     */
    @RequestMapping(value = "/feignHi")
    public String feignHi(@RequestParam(required = false,defaultValue = "hello") String name)
    {
        return eurekaClientFeign.hello(name);
    }
}
