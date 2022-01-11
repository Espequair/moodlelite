package com.mti;

import java.time.LocalDateTime;

public class Activity {
    private String name;
    private String slug;
    private LocalDateTime opening;
    private LocalDateTime closing;
    private String managerLogin;
    private String gitPattern;

    public Activity(
        String name,
        String slug, 
        LocalDateTime opening, 
        LocalDateTime closing, 
        String managerLogin, 
        String gitPattern){
            this.name = name;
            this.slug = slug;
            this.opening = opening;
            this.closing = closing;
            this.managerLogin = managerLogin;
            this.gitPattern = gitPattern;
        }
        
}
