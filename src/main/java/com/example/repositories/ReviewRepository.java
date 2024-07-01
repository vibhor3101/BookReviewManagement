package com.example.repositories;

import com.example.entities.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    Page<Review> findAll(Pageable pageable);
}
