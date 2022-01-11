package com.mti;

import java.time.LocalDateTime;

public class Work {
    public final String tag;
    public final LocalDateTime submissionDate;
    public final String student;

    public Work (String tag, LocalDateTime submissionDate, String student){
        this.student = student;
        this.tag = tag;
        this.submissionDate = submissionDate;
    }
}
