package com.example.readinguserinput;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your year of birth ");

        boolean hasNextInt = scan.hasNextInt();

        if(hasNextInt) {
            int yearOfBirth = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter your name: ");
            String name = scan.nextLine();
            int age = 2019 - yearOfBirth;

            if(age >= 0 && age <= 100 ){
                System.out.print("Your name is " + name + ", and you are " + age + " years old");
            } else {
                System.out.print("Invalid year of birth");
            }
        } else {
            System.out.print("Unable to parse year of birth");
        }

        scan.close();
    }
}
