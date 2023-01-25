package com.bootcamp.demoboard.store.mongo;

import com.bootcamp.demoboard.entity.User;
import com.bootcamp.demoboard.store.UserStore;
import com.bootcamp.demoboard.store.mongo.odm.UserDoc;
import com.bootcamp.demoboard.store.mongo.repository.UserMongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Repository
public class UserMongoStore implements UserStore {

    private final UserMongoRepository userMongoRepository;

    public UserMongoStore(UserMongoRepository userMongoRepository) {
        this.userMongoRepository = userMongoRepository;
    }

    @Override
    public String create(User newUser) {
        //
        UserDoc userDoc = new UserDoc(newUser);
        userMongoRepository.save(userDoc);
        return newUser.getId();
    }

    @Override
    public void update(User newUser) {
        //
        UserDoc userDoc = new UserDoc(newUser);
        userMongoRepository.save(userDoc);
    }

    @Override
    public void delete(String id) {
        //
        this.userMongoRepository.deleteById(id);
    }

    @Override
    public User retrieve(String id) {
        //
        Optional<UserDoc> userDoc = userMongoRepository.findById(id);
        return userDoc.map(UserDoc::toDomain).orElse(null);
    }

    @Override
    public List<User> retrieveAll() {
        //
        List<UserDoc> userDocList = userMongoRepository.findAll();
        return userDocList.stream().map(UserDoc::toDomain).collect(Collectors.toList());
    }
}
