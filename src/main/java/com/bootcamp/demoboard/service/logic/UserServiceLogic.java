package com.bootcamp.demoboard.service.logic;

import com.bootcamp.demoboard.entity.User;
import com.bootcamp.demoboard.service.UserService;
import com.bootcamp.demoboard.store.UserStore;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceLogic implements UserService {

    private final UserStore userStore;

//    public UserServiceLogic(UserStore userStore) {
//        this.userStore = userStore;
//    }

    @Override
    public String register(User newUser) {
        // validate 추가
        return this.userStore.create(newUser);
    }

    @Override
    public void modify(User newUser) {
        this.userStore.update(newUser);
    }

    @Override
    public void remove(String id) {
        this.userStore.delete(id);
    }

    @Override
    public User find(String id) {
        return this.userStore.retrieve(id);
    }

    @Override
    public List<User> findAll() {
        return this.userStore.retrieveAll();
    }
}
