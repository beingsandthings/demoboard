package com.bootcamp.demoboard.store.mongo.odm;

import com.bootcamp.demoboard.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "USER")
public class UserDoc {

    @Id
    private String id;
    private String name;
    private String email;

    public UserDoc(User newUser) {
        super();
        BeanUtils.copyProperties(newUser, this);
    }

    public User toDomain() {
        User user = new User();
        BeanUtils.copyProperties(this, user);
        return user;
    }



}
