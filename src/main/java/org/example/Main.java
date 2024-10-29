package org.example;

import org.example.task1.Display;
import org.example.task2.FileReader;
import org.example.task2.TextData;

public class Main {
    public static void main(String[] args) {
        task1();
        task2(args);
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
}