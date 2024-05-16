package com.example.review1.service;

import com.example.review1.model.ReviewEntity;
import com.example.review1.repository.RestaurantRepository;
import com.example.review1.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.ZonedDateTime;

@RequiredArgsConstructor
@Service
public class ReviewService {
    private final RestaurantRepository restaurantRepository;
    private final ReviewRepository reviewRepository;

    @Transactional
    public void createReview(Long restaurantId, String content, Double score){
        restaurantRepository.findById(restaurantId).orElseThrow();

        ReviewEntity review = ReviewEntity.builder()
                .restaurantId(restaurantId)
                .content(content)
                .score(score)
                .createdAt(ZonedDateTime.now())
                .build();
        reviewRepository.save(review);
    }
    @Transactional
    public void deleteReview(Long reviewId){
        ReviewEntity review = reviewRepository.findById(reviewId).orElseThrow();

        reviewRepository.delete(review);


    }

}
