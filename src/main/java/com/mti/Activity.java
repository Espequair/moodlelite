package com.mti;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;

public class Activity {
    public final String name;
    public final String slug;
    public final LocalDateTime opening;
    public final LocalDateTime closing;
    public final String managerLogin;
    public final String gitPattern;
    public final HashMap<String, Submission> submissionList;
    public final HashSet<String> studentSet;

    public Activity(
        String name,
        String slug, 
        LocalDateTime opening, 
        LocalDateTime closing, 
        String managerLogin, 
        String gitPattern,
        HashMap<String, Submission> submissionList,
        HashSet<String> studentSet
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
