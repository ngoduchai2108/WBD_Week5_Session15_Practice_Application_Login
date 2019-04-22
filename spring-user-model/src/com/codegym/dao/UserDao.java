package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User>users;
    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(10);
        u1.setName("John");
        u1.setAccount("john");
        u1.setEmail("john@codegym.vn");
        u1.setPassword("123456");
        users.add(u1);

        users = new ArrayList<>();
        User u2 = new User();
        u2.setAge(10);
        u2.setName("John");
        u2.setAccount("john");
        u2.setEmail("john@codegym.vn");
        u2.setPassword("123456");
        users.add(u2);

        users = new ArrayList<>();
        User u3 = new User();
        u3.setAge(10);
        u3.setName("John");
        u3.setAccount("john");
        u3.setEmail("john@codegym.vn");
        u3.setPassword("123456");
        users.add(u3);
    }
    public static User checkLogin(Login login){
        for (User u:users){
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
