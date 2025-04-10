package com.bridgelabz.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper;

class Car {
    public String model;
    public int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

public class ConvertJavaObjectToJson {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Car car = new Car("Maruti Dzire", 2024);
            String jsonString = objectMapper.writeValueAsString(car);
            System.out.println(jsonString);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
Output:
    {"model":"Maruti Dzire","year":2024}
 */