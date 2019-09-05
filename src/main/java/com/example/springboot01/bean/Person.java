package com.example.springboot01.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**@ConfigurationProperties 与 @Value
 * 1.批量导入                                               @Value：单个
 * 2.支持松散语法lastName == last_name or last-name         @Value：不支持
 * 3.不支持SpEL #{${person.age}*2}                         @Value：支持
 * 4.支持JSR303数据校验 @Validated  @Email                 @Value：不支持
 * 5.支持复杂类型封装  private Map<Integer,String> map;    @Value：不支持
 *
 */

@PropertySource(value = {"classpath:config/person.properties"})//指定配置属性位置
@Component
@ConfigurationProperties(prefix = "person")
@Validated//校验功能 在@ConfigurationProperties注解可以使用，@value无法使用
public class Person {
//    @Value("${person.lastName}")
//    @Email
    private String lastName;
//    @Value("#{${person.age}*2}")
    private int age;
//    @Value("true")
    private boolean boos;
    private Date birth;

    private Map<Integer,String> map;
    private List<String> list;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + lastName + '\'' +
                ", age=" + age +
                ", boos=" + boos +
                ", birth=" + birth +
                ", map=" + map +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBoos() {
        return boos;
    }

    public void setBoos(boolean boos) {
        this.boos = boos;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
