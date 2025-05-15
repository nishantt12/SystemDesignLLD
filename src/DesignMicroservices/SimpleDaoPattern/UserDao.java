package DesignMicroservices.SimpleDaoPattern;

import DesignMicroservices.models.User;

public interface UserDao {

    User getUser();

    void saveUser(User user);

}
