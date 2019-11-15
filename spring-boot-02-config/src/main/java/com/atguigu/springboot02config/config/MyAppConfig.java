package com.atguigu.springboot02config.config;

import com.atguigu.springboot02config.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 * @ClassName MyAppConfig
 * @Description TODO描述
 * @Author wangyue
 * @Date 2019/11/15 13:23
 **/

/**
 * @Configuration 指明当前类是一个配置类，就是来替代之前的spring配置文件
 *
 */
@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
    @Bean
    public HelloService helloService() {
        System.out.println("配置类@Bean向容器中添加组件");
        return new HelloService();
    }
}
