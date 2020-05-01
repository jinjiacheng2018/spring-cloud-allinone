>> 所有的服务都启动之后
    1.通过网关访问接口
        http://localhost:9050/feignapi/feignHi

    2.通过feign调用其他服务的接口
        http://localhost:9053/feignHi

    3.直接调用接口所在的服务
        http://localhost:9051/hi?name='Tom'

    三种方式，最终调用的是同一个接口