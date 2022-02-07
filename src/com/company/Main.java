package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // int, float, char, String, long, double, boolean

//        int marks = 18;
//        float averageMarks = 19.345f;
//        char grade = 'A';
//        String name = "Rabin";
//        boolean isValid = false;
//
//        long bigNumber = 9876543l;

//        System.out.println(marks);

        // +, -, /, *, %, ++, --

//        int firstNumber = 123;
//        int secondNumber = 234;
//
//        int sum = firstNumber + secondNumber;
//        System.out.println(sum);
//        int firstNumber = 1234;
//        int secondNumber = 234;
//
//        double sum = (double)firstNumber % secondNumber;
//        System.out.println(sum);

//    int a = 12;
////    a = a + 1; this statement increments by 1.
//    a++;
//        System.out.println(a++);
//        System.out.println(a);
//    a--;
//        System.out.println(a);

        // taking user input

//        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age: ");
////        int age = sc.nextInt();
////        float age = sc.nextFloat();
//        String name = sc.nextLine();
//
//        System.out.println(name);


//Conditional Operator
//        int age = 12;
//
//        // >, < >=, ==, !=
//
//        if (age > 18) {
//            System.out.println("you can vote");
//        } else {
//            System.out.println("you can not vote");
//        }
//        System.out.println(19 != 18);
//
//        char grade = 'E';
//        if(grade == 'A') {
//            System.out.println("your grade is very good");
//        }else if (grade =='B') {
//            System.out.println("very good, keep learning");
//        }else if (grade == 'D') {
//            System.out.println("keep improving");
//        } else {
//            System.out.println("invalid grade");
//        }

//       switch case

//        char grade = 'D';
//        switch(grade) {
//            case 'A':
//                System.out.println("your grade is very good");
//                break;
//            case 'B':
//                System.out.println("very good, keep learning");
//                break;
//            case 'C':
//                    System.out.println("keep improving");
//            case 'D':
//                System.out.println("invalid grade");

        // logical operator
//        int age = 500;
//        if(age > 18 || age < 50) {
//            System.out.println("you can vote");
//        } else {
//            System.out.println("you can not vote");
//        }

//        int age = 22;
//        if( !(age > 18 )){
//            System.out.println("you can vote");
//        } else {
//            System.out.println("you can not vote");

        // Loops
        // Three kinds of loop
        // for, while, do-while

//        for (int i = 0; i < 10; i++) {
//            System.out.println("Rabin" + i);
//        }

//        int a = 23;
//        while(true) {
//            System.out.println(a);
//            a++;
//            if(a < 100) {
//                System.out.println(a);
//            }
//        }
//        int a = 23;
//        while(a <= 100) {
//            System.out.println(a);
//            a++;
//        }
//        int a = 23;
//        do {
//            System.out.println(a);
//            a++;
//        } while (a > 100);

//        int a = 23;
//        while(a <= 100) {
//            a++;
//            if (a == 65) continue;
//            System.out.println(a);
//
//        }

//        Array
        // 23, 12, 56, 34, 99
//        int marks [] = new int [5];
//        marks[0] = 23;
//        marks[1] = 12;
//        marks[2] = 56;
//        marks[3] = 34;
//        marks[4] = 99;

//        int marks [] = {23, 12, 56, 34, 99, 12, 55};
//
//        for (int i = 0; i < marks.length; i++) {
//            System.out.println(marks [i]);
//        }

//        int a [] [] = new int [2] [3];
//         int a[] [] = {
//                 {
//                         1, 2
//                 }, {
//                        3, 4
//                 }
//         };
//        System.out.println(a[0] [1]);

        // Method  // function

        //returnType functionName (arguments) {}

        System.out.println(average(8, 6));

    }


        static int average (int firstName, int secondNumber) {
            int sum = firstName + secondNumber;
            return sum / 2;



//

        }

    }



