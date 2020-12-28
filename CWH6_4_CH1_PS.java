package com.company;
import java.util.*;

public class CWH6_4_CH1_PS {
    public static void main(String[] args) {
        double kms,miles;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the kilometres");
        kms = sc.nextDouble();
        miles = kms * 0.621371;
        System.out.println(miles);

    }
}
