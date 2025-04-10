package com.bridgelabz.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper;

class User {
    public String name;
    public int age;
    public String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}

public class ConvertJavaObjectToJson {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            User user = new User("Sehaj", 22, "sehaj@mail.com");
            String jsonString = objectMapper.writeValueAsString(user);
            System.out.println(jsonString);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
Output:
    {"name":"Sehaj","age":22,"email":"sehaj@mail.com"}
 */