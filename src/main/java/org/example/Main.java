package org.example;
public class Main {
    public static void main(String[] args) {
        Display hp = new Display(1920, 1080, 240, "HP");
        Display dell = new Display(3000, 2000, 200, "Dell");

        hp.compareWithMonitor(dell);
    }
}