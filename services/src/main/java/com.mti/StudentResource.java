package com.mti;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.ArrayList;

@Path("/student")
public class StudentResource {
    @Inject StudentService studentService;

    @GET
    public ArrayList<Student> getStudents() {
        return studentService.students;
    }
}
