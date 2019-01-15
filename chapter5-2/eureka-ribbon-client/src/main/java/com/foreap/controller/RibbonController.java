package com.foreap.controller;

import com.foreap.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *<p> Description: Ribbon的入口类 </p>
 *<p> Copyright: Copyright(c) 2019/1/4 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2019/1/4 15:57
 */
@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    // 负载均衡的核心类是LoadBalancerClient，可以获取负载均衡的服务提供者信息
    @Autowired
    private LoadBalancerClient loadBalancer;

    /**
     * 调用Ribbon服务的hi接口，最终调用Eureka-client的接口
     *  - 访问【http://localhost:9052/hi?name=Jack】其实调用了【http://localhost:9051/hi?name=Jack】
     * @param name 名字
     * @return String返回值
     */
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam(required = false,defaultValue = "forezp") String name)
    {
        // 调用ribbonService#hi方法
        return ribbonService.hi(name);
    }

    /**
     * 测试负载均衡,获取服务示例相关的信息
     * @return String
     */
    @RequestMapping(value = "/testRibbon")
    public String testRibbon()
    {
        // 通过服务示例名获取服务的示例
        ServiceInstance serviceInstance = loadBalancer.choose("eureka-client");
        return serviceInstance.getHost() + " : " + serviceInstance.getPort();
    }
}
