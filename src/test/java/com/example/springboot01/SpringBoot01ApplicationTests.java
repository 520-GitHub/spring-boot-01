package com.example.springboot01;

import com.example.springboot01.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01ApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

//    记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {
//        System.out.println(person);
//        日志的级别由低到高 使用logging.level.com.example=trace  调整
       logger.trace("这是trace日志...");
       logger.debug("这是debug日志....");
       logger.info("这是root日志...");
       logger.warn("warn日志....");
       logger.error("这是error日志..");

    }

    @Test
    public void testHelloService() {
        boolean helloService = ioc.containsBean("helloService");
        System.out.println(helloService);
    }

}
