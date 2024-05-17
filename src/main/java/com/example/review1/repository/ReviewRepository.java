package com.example.review1.repository;

import com.example.review1.model.ReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<ReviewEntity,Long>,ReviewRepositoryCustom {
}
