package org.example.Simple_Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       Run();
    }

    public static void Run(){
        try {
            System.out.println("Pick a Number: ");
            Integer numberOne = sc.nextInt();
            System.out.println("Pick a new Number: ");
            Integer numberTwo = sc.nextInt();
            Calculator(numberOne, numberTwo);
        }catch (InputMismatchException e){
            System.out.println("Please enter a valid integer:");
            sc.next(); // Clear the invalid input
        }

    }

    public static void Calculator(Integer numberOne, Integer numberTwo){
        while (true){
            menu();
            System.out.println("pick: ");
            String pick = sc.next();

            switch (pick){
                case ("1") -> {
                    Addition(numberOne, numberTwo);
                }
                case ("2") -> {
                    Subtraction(numberOne,numberTwo);
                }
                case ("3") -> {
                    Multiplication(numberOne,numberTwo);
                }
                case ("4") -> {
                    Division(numberOne,numberTwo);
                }
                case ("5") -> {
                    System.exit(1);
                }
            }
        }
    }

    public static void Addition(Integer numberOne, Integer numberTwo){
        System.out.println(numberOne + numberTwo);
    }

    public static void Subtraction(Integer numberOne, Integer numberTwo){

        System.out.println(numberOne - numberTwo);
    }

    public static void Multiplication(Integer numberOne, Integer numberTwo){
        System.out.println(numberOne * numberTwo);
    }

    public static void Division(Integer numberOne, Integer numberTwo){
        try {
            System.out.println((double) numberOne / numberTwo);
        }catch (ArithmeticException e){
            System.out.println("Not good");
        }

    }

    public static void menu(){
        System.out.println("""
                Addition:1
                Subtraction:2
                Multiplication:3
                Division:4
                Exit:5
                """);
    }

}