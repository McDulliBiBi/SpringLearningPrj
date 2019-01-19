package com.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

//Spring 会自动扫描到@Service注解的类，并把这些类纳入Spring容器中管理。
//也可以用@Component注解，但是@Service注解更能表明该类时服务类
@Service
public class SpringTest {
    @Test
    public void testSpring(){
        //ApplicationContext容器，Spring中比较高级的一种容器，可以加载配置文件中定义的Bean，并将所有的Bean集中在一起，当有请求时分配Bean
        //该接口有三种实现。下面这种是从类路径classpath中寻找指定的配置文件，找到并装载完成ApplicationContext的实例化工作
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringTest springTest = (SpringTest)applicationContext.getBean("springTest");
        springTest.sayHello();
    }

    public void sayHello(){
        System.out.println("hello say");
    }
}
