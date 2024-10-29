package org.example.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReader {
    public static String readFileIntoString(String path) {
        StringBuilder result = new StringBuilder();
        try (InputStream inputStream = FileReader.class.getClassLoader().getResourceAsStream(path)) {

            if (inputStream == null) {
                throw new IOException("The file '" + path + "' was not found in the resources.");
            }

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    result.append(line).append("\n");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            return null;
        }
        return result.toString();
    }
}
