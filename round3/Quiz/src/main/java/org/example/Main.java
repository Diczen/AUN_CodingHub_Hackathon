package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        var questions = GenerateQuestions.questions(5);
        int score = 0;
        System.out.println("""
                Answer all the following questions with the correct sum.
                """);

        for (var question : questions) {
            System.out.println(question + " (T/F)");
            int userAnswer = 0;
            try {
                 userAnswer = input.nextInt();
            } catch (Exception e) {
                System.out.println("Something went wrong, check your input? ");
            }
            if (userAnswer == question.getAns()) {
                score++;
            }
        }

        System.out.printf("Your score is %d", score );
    }
}