package org.example;

import org.example.task1.Display;
import org.example.task2.FileReader;
import org.example.task2.TextData;
import org.example.task3.Assistant;
import org.example.task4.TextDataLoader;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2(args);
//        task3();
//        task4(args);
    }

    public static void task1() {
        Display hp = new Display(1920, 1080, 240, "HP");
        Display dell = new Display(3000, 2000, 200, "Dell");

        hp.compareWithMonitor(dell);
    }
    public static void task2(String[] args) {
        TextData text = new TextData(args[0]);
        System.out.println(text.getText());
        System.out.println(text.getNumberOfVowels());
        System.out.println(text.getNumberOfConsonants());
        System.out.println(text.getNumberOfLetters());
        System.out.println(text.getNumberOfSentences());
        System.out.println(text.getLongestWord());
    }
    public static void task3() {
        Display hp = new Display(1920, 1080, 240, "HP");
        Display dell = new Display(3000, 2000, 200, "Dell");
        Display lg = new Display(1080, 720, 60, "LG");

        Assistant jhon = new Assistant("Jhon");
        jhon.assignDisplay(hp);
        jhon.assignDisplay(dell);
        jhon.assignDisplay(lg);

        jhon.assist();

        jhon.buyDisplay(hp);

        jhon.assist();
    }
    public static void task4(String[] args) {
        List<TextData> texts = TextDataLoader.loadFiles(args);
        for(TextData text : texts) {
            System.out.println(text.getText());
        }
    }
}