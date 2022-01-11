package com.mti;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Submission {
    private String name;
    private String gitPattern;
    private LocalDateTime opening; 
    private LocalDateTime closing;
    private HashMap<String, HashMap<String, Work>> workList;

    public Submission (String name,
            String gitPattern,
            LocalDateTime opening,
            LocalDateTime closing,
            HashMap<String, HashMap<String, Work>> workList) {

        this.gitPattern = gitPattern;
        this.opening = opening;
        this.closing = closing;
        this.workList = workList;
    }

}
