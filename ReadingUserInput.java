package com.example.readinguserinput;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your year of birth ");
        int yearOfBirth = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        int age = 2019 - yearOfBirth;

        System.out.print("\nYour name is " + name + ", and you are " + age + " years old");

        scan.close();
    }
}
