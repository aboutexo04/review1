package com.example.review1.model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Table(name="test")
@Entity
public class TestEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;

    public TestEntity(String name, int age){
        this.name=name;
        this.age=age;
    }
    public TestEntity(){

    }
    public void changeNameAndAge(String name, int age){
        this.name=name;
        this.age=age;

    }

}
