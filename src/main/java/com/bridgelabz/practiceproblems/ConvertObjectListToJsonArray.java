package com.bridgelabz.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

class Person {
    public String name;
    public int age;
    public String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
}

public class ConvertObjectListToJsonArray {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Sehaj", 22, "Engineer"));
        persons.add(new Person("Sam", 24, "Manager"));
        persons.add(new Person("Daisy", 26, "Teacher"));

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String jsonArrayString = objectMapper.writeValueAsString(persons);

            System.out.println(jsonArrayString);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
Output:
    [{"name":"Sehaj","age":22,"job":"Engineer"},{"name":"Sam","age":24,"job":"Manager"},{"name":"Daisy","age":26,"job":"Teacher"}]
 */