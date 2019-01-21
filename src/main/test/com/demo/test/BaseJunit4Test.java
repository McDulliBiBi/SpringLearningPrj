package com.demo.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 用户DAO测试类
 */
//@RunWith：参数化运行器，用于指定JUnit运行环境，是JUnit提供给其他框架测试环境接口扩展。
// 为了便于使用Spring的依赖注入，Spring提供了SpringJUnit4ClassRunner作为JUnit测试环境
//@ContextConfiguration：加载配置文件applicationContext.xml
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class BaseJunit4Test {

}
