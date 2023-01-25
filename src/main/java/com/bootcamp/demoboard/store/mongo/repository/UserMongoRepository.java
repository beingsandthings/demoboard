package com.bootcamp.demoboard.store.mongo.repository;

import com.bootcamp.demoboard.store.mongo.odm.UserDoc;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMongoRepository extends MongoRepository<UserDoc, String> {


}

