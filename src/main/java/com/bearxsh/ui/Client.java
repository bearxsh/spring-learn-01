package com.bearxsh.ui;

import com.bearxsh.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Bearxsh
 * @date 2019/07/25
 */
public class Client {
    public static void main(String[] args) {
        // 1. 获取spring Ioc容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 获取bean
        IUserService iUserService = (IUserService)ac.getBean("userService");
        // 3. 调用bean中的方法
        iUserService.getPersonInfo();
    }
}
