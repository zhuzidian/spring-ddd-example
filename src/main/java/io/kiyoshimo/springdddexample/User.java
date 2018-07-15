package io.kiyoshimo.springdddexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class User {
    @Autowired
    UserDao userDao;

    public void hello() {
        System.out.println(userDao);
    }
}
