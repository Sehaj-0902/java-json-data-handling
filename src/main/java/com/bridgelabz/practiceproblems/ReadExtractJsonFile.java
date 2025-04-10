package com.bridgelabz.practiceproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ReadExtractJsonFile {
    public static void main(String[] args) {
        File jsonFile = new File("C:\\Users\\DELL\\Desktop\\bridgelabz-workspace\\java-json-data-handling\\users.json");
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            JsonNode jsonNode = objectMapper.readTree(jsonFile);
            for (JsonNode element : jsonNode) {
                JsonNode nameNode = element.get("name");
                JsonNode emailNode = element.get("email");
                System.out.println("Name: " + nameNode.asText() + ", Email: " + emailNode.asText());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
Output:
    Name: Sehaj, Email: sehaj@mail.com
    Name: Alice, Email: alice@mail.com
    Name: Daisy, Email: daisy@mail.com
    Name: Sanya, Email: sanya@mail.com
    Name: Rohan, Email: rohan@mail.com
    Name: Sam, Email: sam@mail.com
 */