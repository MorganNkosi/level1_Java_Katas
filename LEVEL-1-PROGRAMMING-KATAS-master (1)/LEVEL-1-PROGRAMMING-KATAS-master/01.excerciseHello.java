package com.example.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please Enter your name: ");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();


        System.out.println("Hello " + name);
    }


}
