package org.example.To_Do_List;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Integer Id = 0;
    static String newTask;

    public static void main(String[] args) {

        while (true) {
            menu();
            Integer pick = sc.nextInt();
            switch (pick) {
                case (1) -> System.exit(1);
                case (2) -> AddTask();
                case (3) -> RemoveTask();
            }
        }
    }


    public static void AddTask() {

        //todo id need to save in another way

        System.out.println("Add a new task to the list: ");
        newTask = sc.next();

        Id++;

        String fullTask = Id + " " + newTask;

        System.out.println(fullTask);

        SaveToFile(fullTask);

    }

    private static void SaveToFile(String fullTask) {
        String filePath = "src\\main\\java\\org\\example\\To_Do_List\\todo-list.txt";

        try {

            File file = new File(filePath);

            if (file.exists()){
                FileWriter FW = new FileWriter(filePath, true);

                FW.write(fullTask + "\n");
                FW.close();
            }else {
                FileWriter FW = new FileWriter(filePath);

                FW.write(fullTask + "\n");

                FW.close();
            }

        } catch (IOException e) {
            System.out.println("Error can't save to file");
        }
    }

    public static void RemoveTask() {
        System.out.println("What task do you want to remove?: ");
        Integer removeTheId = sc.nextInt();

        if (Id.equals(removeTheId)) {
            Id--;
            newTask = "";
            System.out.println("The task is now removed !!");
        }
    }

    public static void MarkTask() {
    }

    public static void menu() {
        System.out.println("""
                1: Exit the program
                2: Add Task
                3: Remove Task""");
    }
}
