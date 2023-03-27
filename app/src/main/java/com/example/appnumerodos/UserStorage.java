package com.example.appnumerodos;

import java.util.ArrayList;

public class UserStorage {

    private static UserStorage single_instance = null;
    ArrayList<User> users = new ArrayList<>();

    private UserStorage(){}

    public static synchronized UserStorage getInstance() {
        if (single_instance == null){
            single_instance = new UserStorage();
        }
        return single_instance;
    }

    public void addUser(User newUser){
        users.add(newUser);
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
