package com.forezp.feign;

import com.forezp.bean.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *<p>
 *  Description: Feign接口调动其他的服务的接口，注意添加注解
 *      注解：@FeignClient(name = "eureka-client"): name指定需要调度服务实例名
 * </p>
 *<p> Copyright: Copyright(c) 2019/1/4 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2019/1/4 16:31
 */
@FeignClient(name = "eureka-client")
public interface EurekaClientFeign {

    /**
     * 通过Feign服务调用，调用eureka-client服务的hi接口
     *  直接将eureka-client服务的接定义在Feign的接口中
     * @param name 注意参数名，还是@RequestParam要写规范
     * @return
     */
    @RequestMapping(value = "/hi")
    String hello(@RequestParam(name = "name") String name);

    @RequestMapping(value = "/userDetail")
    String userDetail(@RequestBody User user);
}
