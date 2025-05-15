package DesignMicroservices.SimpleDaoPattern.transformer;

import DesignMicroservices.SimpleDaoPattern.model.DBUser;
import DesignMicroservices.models.User;

public class UserTransformer {

    public static User toBusinessModel(DBUser dbUser){
        return new User();
    }

    public static DBUser toDbModel(User user){
        return new DBUser();
    }
}
