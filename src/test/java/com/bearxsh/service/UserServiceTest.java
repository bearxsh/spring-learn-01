package com.bearxsh.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Bearxsh
 * @date 2019/07/25
 */
public class UserServiceTest {
    @Test
    public void testGePersonInfo() {
        // 1. 获取spring Ioc容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 获取bean
        IUserService iUserService = (IUserService)ac.getBean("userService");
        // 3. 调用bean中的方法
        iUserService.getPersonInfo();
    }
}
