package com.capgemini.serialization.execution;


import java.io.IOException;
import com.capgemini.serialization.filehandler.FileHandler;

public class JavaApp {

    public static void execution() {
        FileHandler fileHandler = new FileHandler();

        try {
            fileHandler.createTheFile();
            fileHandler.serialization();
            fileHandler.deserialization();
//            fileHandler.deleteTheFile();
            System.out.println("Hello World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}