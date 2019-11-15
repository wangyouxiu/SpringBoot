package com.atguigu.springboot02config.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @ClassName Person
 * @Description TODO描述
 * @Author wangyue
 * @Date 2019/11/15 10:33
 **/

/**
 * 将配置文件中的配置，映射到组件中
 * @ConfigurationProperties:告诉SpringBoot中的所有属性和配置文件中相关的配置进行绑定
 *      prefix = "person" 标识配置文件中哪个下面的所有属性进行一一映射
 *      默认从全局配置文件中获取值
 *
 * 只有这个组件是容器中的组件，才能使用容器提供的@ConfigurationProperties功能
 *
 */
@Component
@ConfigurationProperties(prefix = "person")
@Data
@Validated
@PropertySource(value ={"classpath:person.properties"})
public class Person {
    /**
     *@Email 被校验的值必须是邮箱格式需要配合 @ConfigurationProperties 使用
     */
//    @Value("${person.last-name}")
//    @Email
    private String lastName;
//    @Value("#{11*2}")
    private Integer age;
//    @Value("true")
    private Boolean boss;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

}
