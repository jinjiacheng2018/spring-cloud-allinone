>> 所有的服务都启动之后【注：eureka-ribbon-client服务可以不用启动，暂时没有作用】
    1.通过网关访问接口
        http://localhost:9050/feignapi/feignHi

    2.通过feign调用其他服务的接口
        http://localhost:9053/feignHi

    3.直接调用接口所在的服务
        http://localhost:9051/hi?name='Tom'

    三种方式，最终调用的是同一个接口

    4.使用postman调用接口，返回json信息
        http://localhost:9050/feignapi/feignUserDetail
        http://localhost:9053/feignUserDetail
        http://localhost:9051/userDetail

        {
        	"userNo":1,
        	"userName":"Tom",
        	"userBirthday":"2020-05-01"
        }