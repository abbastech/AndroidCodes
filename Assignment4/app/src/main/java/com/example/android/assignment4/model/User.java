package com.example.android.assignment4.model;

import io.realm.RealmObject;


/**
 * Created by salmanjawed on 05/11/2017.
 */

public class User extends RealmObject {


    private String userName;
    private String userEmail;
    private String userPassword;

    public User() {
    }


    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
