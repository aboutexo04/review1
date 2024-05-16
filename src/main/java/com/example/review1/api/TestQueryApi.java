package com.example.review1.api;

import com.example.review1.model.TestEntity;
import com.example.review1.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TestQueryApi {
    private final TestService testService;

    @GetMapping("/test/query/jpa")
    public List<TestEntity> queryJpa(){

        return testService.findAllByNameByJPA("sunny");
    }
    @GetMapping("/test/query/querydsl")
    public List<TestEntity> queryQuerydsl(){
        return testService.findAllByNameByQuerydsl("sunny");
    }
}
