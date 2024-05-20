package com.xiongdwm.challenge.bean;

import java.util.Date;

public class PerformanceReview {
    private Long id;
    private Long formId;
    private String adminScored; //admin score the performance, in string, split by commas
    private String peerScored; //coworker score the performance, in string, split by commas
    private String feedback;
    private Long uid; //user id
    private Date createDate; //date when performance review assign to one
    private Long coworkerId; // whom assign by admin to participate in one's review
    private Stage stage;

    public enum Stage{
        ADMIN,
        PEER,
        FEEDBACK
    }
}
