package org.example.dao;

import org.example.entity.User;
import org.example.utils.enums.Role;

public class UserDAO {

    public boolean checkUser(User user) {
        if (user != null) {
            if ("admin".equals(user.getUserName())
                    && "admin".equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
