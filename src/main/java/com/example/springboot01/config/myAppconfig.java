package com.example.springboot01.config;

import com.example.springboot01.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration :指明当前类是一个配置类，代替之前的spring配置文件
 *<bean id="helloService" class="com.example.springboot01.service.HelloService"></bean>
 *
 */

@Configuration
public class myAppconfig {

    @Bean//将方法的返会值添加到容器当中，容器中这个组件默认的id就是方法名
    public HelloService helloService(){

        return new HelloService();
    }

}
