package com.mti;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;

@ApplicationScoped
public class StudentService {
    public final ArrayList<Student> students;

    public StudentService(){
        students = new ArrayList<>();
    }
}
