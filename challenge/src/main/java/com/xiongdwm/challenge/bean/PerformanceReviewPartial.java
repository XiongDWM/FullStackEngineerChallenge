package com.xiongdwm.challenge.bean;


/**
 *  performance review's columns, include content and contents' value
 */
public class PerformanceReviewPartial {
    private Long id;

    private Long formId;
    private String content;
    private int score;
    private int index; //to order cols
    private boolean changeable; //after finally confirm a form, all contents cannot be changed.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isChangeable() {
        return changeable;
    }

    public void setChangeable(boolean changeable) {
        this.changeable = changeable;
    }
}
