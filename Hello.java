package com.example.java;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Enter name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Hello " + name);

    }

}
