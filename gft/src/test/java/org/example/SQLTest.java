package org.example;

import model.entities.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQLTest {

    @Test
    void testAddUser() {
        User user = new User("John", "psd", "john@mail.com", 175, 70, 30, "Male", 3);

        String name = "John";
        String password = "psd";
        String mail = "john@mail.com";
        int height = 175;
        int weight = 70;
        int age = 30;
        String gender = "Male";
        int activity = 3;

        SQL.addUser(name, password, mail, height, weight, age, gender, activity);

        assertEquals(1, SQL.getUserList().size());
        User addedUser = SQL.getUserList().get(0);
        assertEquals(name, addedUser.getName());
        assertEquals(password, addedUser.getPassword());
        assertEquals(mail, addedUser.getMail());
        assertEquals(height, addedUser.getHeight());
        assertEquals(weight, addedUser.getWeight());
        assertEquals(age, addedUser.getAge());
        assertEquals(gender, addedUser.getGender());
        assertEquals(activity, addedUser.getActivity());
    }
}