package com.mti;

import java.time.LocalDateTime;

public class Work {
    private String tag;
    private LocalDateTime submissionDate;
    private String student;

    public Work (String tag, LocalDateTime submissionDate, String student){
        this.student = student;
        this.tag = tag;
        this.submissionDate = submissionDate;
    }
}
