package com.mti;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Submission {
    public final String name;
    public final String gitPattern;
    public final LocalDateTime opening;
    public final LocalDateTime closing;
    public final HashMap<String, HashMap<String, Work>> workList;

    public Submission(String name,
                      String gitPattern,
                      LocalDateTime opening,
                      LocalDateTime closing,
                      HashMap<String, HashMap<String, Work>> workList) {
        this.name = name;
        this.gitPattern = gitPattern;
        this.opening = opening;
        this.closing = closing;
        this.workList = workList;
    }

}
