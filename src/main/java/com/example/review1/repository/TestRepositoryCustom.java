package com.example.review1.repository;

import com.example.review1.model.TestEntity;

import java.util.List;

public interface TestRepositoryCustom {

    public List<TestEntity>findAllByNameByQuerydsl(String name);
}
