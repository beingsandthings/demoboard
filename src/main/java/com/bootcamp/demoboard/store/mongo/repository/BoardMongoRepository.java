package com.bootcamp.demoboard.store.mongo.repository;

import com.bootcamp.demoboard.store.mongo.odm.BoardDoc;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardMongoRepository extends MongoRepository<BoardDoc, String> {
}
