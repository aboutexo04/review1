package com.example.review1.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@AllArgsConstructor
@Entity
@Builder
@Getter
@NoArgsConstructor
@Table(name="review")
public class ReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  Long restaurantId;
    private String content;
    private Double score;
    private ZonedDateTime createdAt;

}
