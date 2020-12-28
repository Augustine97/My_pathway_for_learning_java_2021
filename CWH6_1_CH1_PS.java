/*
Add three numbers in Java
 */
package com.company;
import java.util.*;

public class CWH6_1_CH1_PS {
    public static void main(String[] args) {
        int a,b,c,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value:");
        a = sc.nextInt();
        System.out.println("Enter the second value:");
        b =  sc.nextInt();
        System.out.println("Enter the third value:");
        c = sc.nextInt();
        sum = a+b+c;
        System.out.println(sum);
        System.out.println("Done");

    }
}
