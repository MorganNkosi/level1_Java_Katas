package com.company;
import java.util.Scanner;

public class isosceles {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter number :");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        pyramid(num);
    }

    public static void pyramid(int height) {
        for (int i = 1; i <= height; i++) {

            for (int j = i; j<height; j++)
                System.out.print(" ");

            for (int k = 1; k <(i*2); k++)
                System.out.print("#");
            System.out.print("\n");
        }
    }
}
