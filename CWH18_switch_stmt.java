package com.company;
import java.util.*;

public class CWH18_switch_stmt {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age");
        age =  sc.nextInt();
        //switch case
        switch(age){
            case 18:
                System.out.println("You are going to become an adult!");
                break;

            case 23:
                System.out.println("You are going to join a job!");
                break;

            case 60:
                System.out.println("You are going to get retired!");
                break;

            default:
                System.out.println("I will be a great developer and will get project soon.");


        }
        System.out.println("------Done with switch-----");



    }

}
