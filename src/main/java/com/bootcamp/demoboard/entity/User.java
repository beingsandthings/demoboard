package com.bootcamp.demoboard.entity;

import com.bootcamp.demoboard.entity.sdo.BoardCdo;
import com.bootcamp.demoboard.entity.sdo.UserCdo;
import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.BeanUtils;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Getter
@Setter
@ToString
public class User {

    @Id
    private String id;
    private String name;
    private String email;

    public User() {
        this.id = UUID.randomUUID().toString();
    }

    public User(String name, String email) {
        this();
        this.name = name;
        this.email = email;
    }

    public User(UserCdo userCdo) {
        super();
        BeanUtils.copyProperties(userCdo, this);
    }

    public static User sample() {
        return new User("Park", "park@naver.com");
    }

    public static void main(String[] args) {
        User user = new User("kim", "kim@naver.com");
        System.out.println(new Gson().toJson(user));
    }
}
