package com.forezp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaServerApplicationTests
{
    
    @Test
    public void contextLoads()
    {
        System.out.println("develop分支添加新的内容");
    }

    @Test
    public void test1()
    {
        System.out.println("测试分支的合并操作！");
    }
    
}
