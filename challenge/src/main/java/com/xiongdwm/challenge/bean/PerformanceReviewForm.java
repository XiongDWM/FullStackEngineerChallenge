package com.xiongdwm.challenge.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * performance review form for different season, combine by performanceReviewPartial
 */
@Entity
@Table(name="performance_review")
public class PerformanceReviewForm {
    @Id
    private Long id;
    private String version;
    private int total; //total score limit for this form

}
