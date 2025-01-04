package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise31 {

    public static void main(String[] args)  {
        String filepath = "src/main/resources/lorem.txt";
        try (FileReader file = new FileReader(filepath);
             BufferedReader buffer = new BufferedReader(file);
        ) {
            String line;
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
