package com.app.userserviceapp.controller;

import com.app.userserviceapp.model.User;

import java.util.ArrayList;

public class UsersList {
    Iterable<User> users;

    public Iterable<User> getUsers() {
        return users;
    }

    public void setUsers(Iterable<User> users) {
        this.users = users;
    }

    public UsersList(Iterable<User> users) {
        this.users = users;
    }

    public UsersList() {
        this.users = new ArrayList<>();
    }
}
