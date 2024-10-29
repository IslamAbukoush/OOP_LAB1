package org.example.task2;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.io.File;

public class TextData {
    private final String fileName;
    private final String text;
    private Integer numberOfVowels;
    private Integer numberOfConsonants;
    private Integer numberOfLetters;
    private Integer numberOfSentences;
    private String longestWord;

    public TextData(String fileName) {
        this.fileName = fileName;
        String text = FileReader.readFileIntoString(fileName);
        this.text = Objects.requireNonNullElse(text, "");
    }

    public String getFileName() {
        return fileName;
    }
    public String getText() {
        return text;
    }
    public int getNumberOfVowels() {
        if (numberOfVowels == null) {
            Pattern vowelPattern = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
            Matcher matcher = vowelPattern.matcher(text);

            int count = 0;
            while (matcher.find()) {
                count++;
            }

            numberOfVowels = count;
        }
        return numberOfVowels;
    }
    public int getNumberOfConsonants() {
        if (numberOfConsonants == null) {
            Pattern consonantPattern = Pattern.compile("[bcdfghjklmnpqrstvwxyz]", Pattern.CASE_INSENSITIVE);
            Matcher matcher = consonantPattern.matcher(text);

            int count = 0;
            while (matcher.find()) {
                count++;
            }

            numberOfConsonants = count;
        }
        return numberOfConsonants;
    }
    public int getNumberOfLetters() {
        if (numberOfLetters == null) {
            Pattern letterPattern = Pattern.compile("[a-zA-Z]");
            Matcher matcher = letterPattern.matcher(text);

            int count = 0;
            while (matcher.find()) {
                count++;
            }

            numberOfLetters = count;
        }
        return numberOfLetters;
    }
    public int getNumberOfSentences() {
        if (numberOfSentences == null) {
            Pattern sentencePattern = Pattern.compile("[.!?](\\s|$)");
            Matcher matcher = sentencePattern.matcher(text);

            int count = 0;
            while (matcher.find()) {
                count++;
            }

            numberOfSentences = count;
        }
        return numberOfSentences;
    }

    public String getLongestWord() {
        if (longestWord == null) {
            Pattern wordPattern = Pattern.compile("\\b\\w+\\b");
            Matcher matcher = wordPattern.matcher(text);

            String longest = "";
            while (matcher.find()) {
                String word = matcher.group();
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }

            longestWord = longest;
        }
        return longestWord;
    }
}
