package com.bridglabz.logical;
import  java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        fibonacii(n);
    }

    static void fibonacii(int n) {
        int x = 0, y = 1, z = 0, count = 1;
        while (count <= n) {
            System.out.println(z + "   ");
            z = x + y;
            y = x;
            x = z;
            count++;

        }

    }
}