package com.slamapp.slamappbackend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    // define DB fields/attributes
    @Id
    private ObjectId id;
    private String firstName;
    private String lastName;
    @Indexed(unique = true)
    private String email;
}
