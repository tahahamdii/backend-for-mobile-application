package com.flesk.messageriee.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "User")

public class User {

    @Id

    private String id;
    private String username;
    private String email;
    private  String birthday;
    private String password;
    private String resetCode;
    private String role;



    public User (String username ,String email ,String birthday , String password , String resetCode , String role ){

        this.username=username;
        this.email=email;
        this.birthday=birthday;
        this.password=password;
        this.resetCode=resetCode;
        this.role=role;


    }


}
