##SpringCloud-Eureka服务注册与发现
###1.pom文件需要的起步依赖(继承的父工程是SpringBoot工程)
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-eureka-server</artifactId>
    </dependency> 
   
###.yml文件需要的对Eureka的配置
    server:
      port: 10301
    eureka:
      instance:
        hostname: localhost
      client:
        // 配置为false，防止eureka自己注册自己
        register-with-eureka: false     
        fetch-registry: false
        // 配置访问eureka的地址
        service-url:
          defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/
    
###3.启动类添加注解开启对EurekaServer的支持
    @EnableEurekaServer
    @SpringBootApplication
    public class EurekaServerApplication
    {
        public static void main(String[] args)
        {
            SpringApplication.run(EurekaServerApplication.class, args);
        }
    }