package com.bearxsh.service.impl;

import com.bearxsh.dao.IUserDao;
import com.bearxsh.service.IUserService;

/**
 * @author Bearxsh
 * @date 2019/07/25
 */
public class UserServiceImpl implements IUserService {
    private IUserDao userDao;

    /**
     * 配置文件的property属性必须有setter方法
     * @param userDao
     */
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public void getPersonInfo() {
        userDao.getPersonInfo();
    }
}
