package org.example;

import model.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SQL {

    private static User currentUser;

    public User getCurrentUser(){
        return currentUser;
    }

    private static ArrayList<User> UserList = new ArrayList<User>();

    public boolean loginCheck(String inputusername, String inputpassword) {
        User test = new User ("1","1","1",1,1,1, "1",1);
        UserList.add(test);
        for (User u: UserList){
            if (Objects.equals(u.getName(), inputusername) && Objects.equals(u.getPassword(), inputpassword)){
                currentUser = u;
                return true;
            }
        }
        return false;
    }

    public static void addUser(String name, String password, String mail, int height, int weight, int age, String gender, int activity) {
        User user = new User(name, password, mail, height, weight, age, gender, activity);
        UserList.add(user);
    }

    public static List<User> getUserList() {
        return UserList;
    }
}