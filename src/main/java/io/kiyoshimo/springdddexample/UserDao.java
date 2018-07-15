package io.kiyoshimo.springdddexample;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
    public User findOne(long id) {
        System.out.println("findOne " + id);
        return new User();
    }
}
