package com.bearxsh.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Bearxsh
 * @date 2019/07/25
 */
public class UserDaoTest {
    @Test
    public void testGetPersonInfo() {
        // 1. 获取spring Ioc容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 获取bean
        IUserDao iUserDao = (IUserDao)ac.getBean("userDao");
        // 3. 调用bean中的方法
        iUserDao.getPersonInfo();
    }
}
