package DesignMicroservices.SimpleDaoPattern.mysql;

import DesignMicroservices.SimpleDaoPattern.UserDao;
import DesignMicroservices.SimpleDaoPattern.model.DBUser;
import DesignMicroservices.SimpleDaoPattern.transformer.UserTransformer;
import DesignMicroservices.models.User;

public class DbUserDao implements UserDao {
    @Override
    public User getUser() {
        return UserTransformer.toBusinessModel(new DBUser());
    }

    @Override
    public void saveUser(User user) {
        UserTransformer.toDbModel(user);
    }
}

