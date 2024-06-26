package com.example.review1.api;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestLombokApi {
@GetMapping("/test/lombok")
    public TestLombokResponseBody testLombok(){
     return new TestLombokResponseBody("backend",30);
    }

    @Getter
    @AllArgsConstructor
    public static class TestLombokResponseBody{
    String name;
    int age;

    }
}
