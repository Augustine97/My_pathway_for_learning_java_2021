package com.company;
import java.util.*;

public class CWH6_2_CH1_PS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c,total,avg;
        System.out.println("Enter the marks of first subject");
        a = sc.nextInt();
        System.out.println("Enter the marks of second subject");
        b = sc.nextInt();
        System.out.println("Enter the marks of third subject");
        c = sc.nextInt();
        total = a + b + c;
        avg = (total/3);
        System.out.println((int)(avg));

    }
}
