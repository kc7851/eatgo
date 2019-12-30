package com.skc.eatgo.application;

import com.skc.eatgo.application.ReviewService;
import com.skc.eatgo.domain.Review;
import com.skc.eatgo.domain.ReviewRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

public class ReviewServiceTests {

    private ReviewService reviewService;

    @Mock
    private ReviewRepository reviewRepository;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        reviewService = new ReviewService(reviewRepository);
    }

    @Test
    public void addReview() {
        reviewService.addReview(1004L, "skc", 3, "mat-it-da");

        verify(reviewRepository).save(any());
    }
}