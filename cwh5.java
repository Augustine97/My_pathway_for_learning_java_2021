package com.company;
import java.util.*;

public class cwh5 {
    public static void main(String[] args) {
        float s1,s2,s3,s4,s5,total,tm,per;
        System.out.println("Challenge1 : Calculation percentage of a given student in CBSE board exam ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of first subject");
        s1 = sc.nextFloat();
        System.out.println("Enter the marks of second subject");
        s2 = sc.nextFloat();
        System.out.println("Enter the marks of third subject");
        s3 = sc.nextFloat();
        System.out.println("Enter the marks of fourth subject");
        s4 = sc.nextFloat();
        System.out.println("Enter the marks of fifth subject");
        s5 = sc.nextFloat();
        System.out.println("Enter the total marks");
        tm = sc.nextFloat();
        total = (s1 + s2 + s3 + s4 + s5)*100;
        per = (int) (total/tm);
        if ((int)(per) != 0 ){
            System.out.println((int)(per));
            System.out.println("Done");

        }
        else{
            System.out.println("Check your code for errors");
        }






    }

}
