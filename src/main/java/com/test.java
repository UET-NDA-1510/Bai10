package com;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class test {
    public static void main(String[] args) throws Exception {
//        Gson gson = new Gson();
//        User user = new User("Duc anh", 18, "abc@gmail.com");
//        user.getEmail();
//        user.grade.add(12);
//        user.grade.add(13);
//        user.grade.add(14);
//        user.grade.add(15);
//        user.point.put("a", 1);
//        user.point.put("b", 2);
//        user.point.put("c", 3);
//        user.point.put("d", 4);
//        String jsoon = gson.toJson(user);
//        System.out.println(jsoon);
        int a = 10;
        int b = a;
        a = 99;
        System.out.println(b);
    }
}
class User {
    private String name;
    private int age;
    private String email;
    Map<String, Integer> point = new HashMap<>();
    List<Integer> grade = new ArrayList<>();
    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    // Getters and Setters...

    public String getEmail() {
        int a;

        return email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}