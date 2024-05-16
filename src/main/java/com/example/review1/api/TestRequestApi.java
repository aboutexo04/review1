package com.example.review1.api;


import org.springframework.web.bind.annotation.*;

@RestController
public class TestRequestApi {
//Request Parameter 방식
    @GetMapping("/test/param")
    public String requestParam(
            @RequestParam("name") String name,
            @RequestParam("age") int age
    ){
        return "Hello, Request Param, I am "+name+","+age+"years old.";
    }
    //Path Variable 방식
    @GetMapping("/test/path/{name}/{age}")
    public String requestPathVariable(
            @PathVariable("name") String name,
            @PathVariable("age") int age
    ){
        return "Hello, Path Variable, I am "+name+","+age+" years old.";
    }

    //Request Body 방식
    @PostMapping ("/test/body")

    public String requestBody(
            @RequestBody TestRequestBody request
    ){
        return "Hello, Request Body, I am"+request.name+","+request.age+" years old.";
    }

    public static class TestRequestBody{
        String name;
        int age;

        public TestRequestBody(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
