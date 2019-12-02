package com.company;

import java.util.Scanner;

public class triangle {

    public static void main(String[] args) {
        System.out.println("Enter unit size");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = 0; i <= number ; i++)
        {
            for (int j = 0; j < i ; j++)
            {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
