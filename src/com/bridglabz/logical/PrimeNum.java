package com.bridglabz.logical;
import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args){
         Scanner scn = new Scanner(System.in);

            System.out.println("Enter a Number");
            int n = scn.nextInt();
            int temp = 0;

            for(int i =2; i<=n-1; i++) {

                if (n % i == 0) {
                    temp = temp + 1;
                }
            }
                if (temp > 0)
            {
                System.out.println("it is a prime number");
            }

            else
            {
                System.out.println("it is not a prime number");
            }
        }

    }

