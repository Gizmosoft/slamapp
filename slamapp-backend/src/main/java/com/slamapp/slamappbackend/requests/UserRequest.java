package com.slamapp.slamappbackend.requests;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;

@Data
public class UserRequest {
    private ObjectId id;
    private String firstName;
    private String lastName;
    private String email;
}
