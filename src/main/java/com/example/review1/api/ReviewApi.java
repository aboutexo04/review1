package com.example.review1.api;


import com.example.review1.api.request.CreateReviewRequest;
import com.example.review1.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ReviewApi {
    private final ReviewService reviewService;

    @PostMapping("/review")
    public void createReview(
            @RequestBody CreateReviewRequest request
            ){
        reviewService.createReview(request.getRestaurantId(),request.getContent(),request.getScore());

    }
    @DeleteMapping("/review/{reviewId}")
    public void deleteReview(@PathVariable("reviewId")Long reviewId){
        reviewService.deleteReview((reviewId));

    }
}
