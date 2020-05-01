package com.forezp.controller;

import com.alibaba.fastjson.JSON;
import com.forezp.bean.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *<p> Description: 测试Controller层，入口类 </p>
 *<p> Copyright: Copyright(c) 2019/1/4 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2019/1/4 15:11
 */
@RestController
public class HiController {

    @Value("${server.port}")
    private String port;

    /**
     * 测试访问接口【http://localhost:9051/hi】
     * @return string
     */
    @RequestMapping(value = "/hi")
    public String hello(@RequestParam String name){
        return "Hi," + name + "!!! Service port is " + port;
    }

    /**
     * 测试访问接口【http://localhost:9051/userDetail】
     * @param user 用户对象
     * @return 用户对象的json字符串
     */
    @RequestMapping(value = "/userDetail")
    public String sayHello(@RequestBody User user){
        return JSON.toJSONString(user);
    }
}
