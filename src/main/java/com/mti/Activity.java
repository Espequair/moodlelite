package com.mti;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;

public class Activity {
    private String name;
    private String slug;
    private LocalDateTime opening;
    private LocalDateTime closing;
    private String managerLogin;
    private String gitPattern;
    HashMap<String, Submission> submissionList;
    HashSet<String> studentSet;

    public Activity(
        String name,
        String slug, 
        LocalDateTime opening, 
        LocalDateTime closing, 
        String managerLogin, 
        String gitPattern,
        HashMap<String, Submission> submissionList,
        HashSet<String> studentList
        )
        {
            this.name = name;
            this.slug = slug;
            this.opening = opening;
            this.closing = closing;
            this.managerLogin = managerLogin;
            this.gitPattern = gitPattern;
            this.submissionList = submissionList;
            this.studentSet = studentSet;
        }

}
