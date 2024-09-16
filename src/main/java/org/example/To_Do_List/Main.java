package org.example.To_Do_List;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static Integer Id = 0;

    public static void main(String[] args) {

        while (true) {
            menu();
            Integer pick = sc.nextInt();
            switch (pick) {
                case (1) -> System.exit(1);
                case (2) -> AddTask();
            }
        }

    }


    public static void AddTask() {

        System.out.println("Add a new task to the list: ");
        String newTask = sc.next();

        Id++;

        String fullTask = Id + " " + newTask;

        System.out.println(fullTask);

    }

    public void RemoveTask() {
    }

    public void MarkTask() {
    }

    public static void menu() {
        System.out.println("""
                1: Exit the program
                2: Add Task""");
    }
}
