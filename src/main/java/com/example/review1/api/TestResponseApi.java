package com.example.review1.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResponseApi {

    @GetMapping("/test/response/string")
    public String stringResponse(){
        return "This is String";
    }
    @GetMapping("/test/response/json")
    public TestResponseBody jsonResponse(){
        return  new TestResponseBody("sunny",20);
    }
    public static class TestResponseBody{
        String name;
        int age;

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public TestResponseBody(String name, int age) {
            this.name = name;
            this.age = age;


        }
    }
}
