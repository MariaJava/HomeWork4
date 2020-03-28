package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade;
        System.out.println("Введите вашу оценку");
        grade = scanner.nextInt();
        if (grade < 25 && grade > 0)
            System.out.println("Ваша оценка 'F'");
        if (grade >= 25 && grade < 45)
            System.out.println("Ваша оценка 'Е'");
        if (grade >= 45 && grade < 50)
            System.out.println("Ваша оценка 'D'");
        if (grade >= 50 && grade < 60)
            System.out.println("Ваша оценка 'C'");
        if (grade >= 60 && grade < 80)
            System.out.println("Ваша оценка 'B'");
        if (grade >80)
            System.out.println("Ваша оценка 'A'");
        if (grade==0)
            System.out.println("Перездайте задание");
    }
}