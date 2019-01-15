package com.foreap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *<p> Description: Ribbon的Service层 </p>
 *<p> Copyright: Copyright(c) 2019/1/4 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2019/1/4 15:53
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 调用eureka-client服务的hi接口
     * @param name 名字
     * @return String接口返回值
     */
    public String hi(String name)
    {
        // 通过restTemplate通过url和参数调用另外一个服务示例的接口
        return restTemplate.getForObject("http://eureka-client/hi?name="+name,String.class);
    }

}
