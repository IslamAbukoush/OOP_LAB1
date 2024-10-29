package org.example.task4;

import org.example.task2.TextData;

import java.util.ArrayList;
import java.util.List;

public class TextDataLoader {
    public static List<TextData> loadFiles(String[] filePaths) {
        List<TextData> result = new ArrayList<TextData>();
        for(String path : filePaths) {
            result.add(new TextData(path));
        }
        return result;
    }
}
