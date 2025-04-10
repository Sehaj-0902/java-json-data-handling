package com.bridgelabz.practiceproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class FilterJsonRecords {
    public static void main(String[] args) {
        File jsonFile = new File("C:\\Users\\DELL\\Desktop\\bridgelabz-workspace\\java-json-data-handling\\users.json");
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            JsonNode jsonNode = objectMapper.readTree(jsonFile);
            for (JsonNode userNode : jsonNode) {
                JsonNode nameNode = userNode.get("name");
                JsonNode ageNode = userNode.get("age");
                int age = ageNode.asInt();
                if (age > 25) {
                    System.out.println("Name: " + nameNode.asText() + ", Age: " + age);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
Output:
    Name: Alice, Age: 27
    Name: Rohan, Age: 28
    Name: Sam, Age: 31
 */