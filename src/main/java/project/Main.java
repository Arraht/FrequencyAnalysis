package project;

import project.process.Process;

public class Main {
    private static final Process process = new Process();

    public static void main(String[] args) {
        String[] text = new String[16];
        Integer[] numbers = new Integer[16];
        text[0] = "Hello";
        text[1] = "World";
        text[2] = "Hello";
        text[4] = "apple";
        text[5] = "apple";
        text[6] = "apple";
        System.out.println(process.countElements(text) + "\n");
        numbers[0] = 1;
        numbers[1] = 1;
        numbers[2] = 1;
        numbers[3] = 2;
        numbers[4] = 3;
        numbers[5] = 4;
        numbers[6] = 5;
        numbers[7] = 6;
        numbers[8] = 6;
        numbers[9] = 7;
        System.out.println(process.countElements(numbers) + "\n");
    }
}