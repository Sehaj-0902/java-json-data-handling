package com.bridgelabz.practiceproblems;

import org.json.JSONObject;

public class MergeJsonObjects {
    public static void main(String[] args) {
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("name", "Sehaj");
        jsonObject1.put("age", 22);

        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("email", "sehaj@mail.com");

        for (String key : jsonObject2.keySet()) {
            jsonObject1.put(key, jsonObject2.get(key));
        }

        System.out.println("Merged Json Object:\n" + jsonObject1);
    }
}

/*
Output:
    Merged Json Object:
    {"name":"Sehaj","age":22,"email":"sehaj@mail.com"}
 */