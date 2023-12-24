package com.slamapp.slamappbackend.repository;

import com.slamapp.slamappbackend.models.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByEmail(String email);
}