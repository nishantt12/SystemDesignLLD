package DesignMicroservices.business.controller;

import DesignMicroservices.SimpleDaoPattern.UserDao;
import DesignMicroservices.SimpleDaoPattern.mysql.DbUserDao;
import DesignMicroservices.models.User;

public class UserController {

    UserDao userDao = new DbUserDao();

    User getUser() {
        return userDao.getUser();
    }

    void saveUser(User user) {
        userDao.saveUser(user);
    }
}
