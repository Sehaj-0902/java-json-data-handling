package com.bridgelabz.practiceproblems;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonObject {
    public static void main(String[] args) {
        JSONArray subjects = new JSONArray();
        subjects.put("Data Structures and Algorithms");
        subjects.put("Cloud Computing");
        subjects.put("Web Development");

        JSONObject student = new JSONObject();
        student.put("name", "Sehaj");
        student.put("age", 22);
        student.put("subjects", subjects);

        System.out.println(student);
    }
}

/*
Output:
    {"subjects":["Data Structures and Algorithms","Cloud Computing","Web Development"],"name":"Sehaj","age":22}
 */