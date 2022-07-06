package com.bridglabz.logical;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n =sc.nextInt();
        int reminder,reverse=0;
        while (n!=0){

            reminder=n%10;
            reverse=reverse*10+reminder;
            n=n/10;
        }
        System.out.println(reverse+" is a Reverse Number");
    }
}
