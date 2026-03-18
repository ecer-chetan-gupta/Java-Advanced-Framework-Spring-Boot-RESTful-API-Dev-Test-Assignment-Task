package com.capgemini.serialization.filehandler;


import java.io.File;
import java.io.IOException;

import com.capgemini.serialization.entity.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FileHandler {

    private static final String PATH = "src/main/resources/Student.json";
    private static final File FILE = new File(PATH);
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public void createTheFile() throws IOException {
        if (FILE.createNewFile()) {
            System.out.println("JSON File Created Successfully");
        } else {
            System.out.println("JSON File Already Exists!");
        }
    }

    public void serialization() throws IOException {
        Student student = new Student(1, "Raja", "raja@gmail.com", 9876543210L);
        OBJECT_MAPPER.writeValue(FILE, student);
        System.out.println("Serialization Done Successfully!");
    }

    public void deserialization() throws IOException {
        Student student = OBJECT_MAPPER.readValue(FILE, Student.class);
        System.out.println(student);
        System.out.println("Deserialization Done Successfully!");
    }

    public void deleteTheFile() {
        if (FILE.delete()) {
            System.out.println("JSON File Deleted Successfully!");
        } else {
            System.out.println("JSON File Doesn't Exist!");
        }
    }
}
