package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @version 1.0
 * @ClassName HelloWorldMainApplication
 * @Description TODO描述
 * @Author wangyue
 * @Date 2019/11/14 17:20
 **/

/**
 * @SpringBootApplication 标注这是一个springBoot程序
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
