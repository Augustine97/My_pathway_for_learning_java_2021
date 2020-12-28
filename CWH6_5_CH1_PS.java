package com.company;
import java.util.*;

public class CWH6_5_CH1_PS {
    public static void main(String[] args) {
        //int a;
        boolean a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        a = sc.hasNextInt();
        System.out.println(a);
        if (a){
            System.out.println("Data entered is of type integer");
        }
        else{
            System.out.println("Data entered is not of type integer.");
        }
    }
}
