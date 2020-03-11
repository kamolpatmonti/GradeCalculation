package com.montivory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Input your accumulated score to grade calculate: ");
        int accuScore = sc.nextInt();
        System.out.print("Please Input your midpoint score to grade calculate: ");
        int midScore = sc.nextInt();
        System.out.print("Please Input your final score to grade calculate: ");
        int finalScore = sc.nextInt();

        int totalScore = accuScore + midScore + finalScore;

        if (totalScore >= 0 && totalScore <= 49) {
            System.out.println("Your grade is F");
        } else if (totalScore >= 50 && totalScore <= 54) {
            System.out.println("Your grade is D+");
        } else if (totalScore >= 55 && totalScore <= 59) {
            System.out.println("Your grade is D+");
        } else if (totalScore >= 60 && totalScore <= 64) {
            System.out.println("Your grade is C");
        } else if (totalScore >= 65 && totalScore <= 69) {
            System.out.println("Your grade is C+");
        } else if (totalScore >= 70 && totalScore <= 74) {
            System.out.println("Your grade is B");
        } else if (totalScore >= 75 && totalScore <= 79) {
            System.out.println("Your grade is B+");
        } else if (totalScore >= 80 && totalScore <= 100) {
            System.out.println("Your grade is A");
        } else {
            System.out.println("your score is invalid number");
        }
    }
}
