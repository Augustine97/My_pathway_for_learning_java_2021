
//Strings are immutable
package com.company;
import java.util.*;

public class CWH13_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name,name1,name2,name3;
        float a = 5.6454f;
        System.out.print("Enter your name"); //System.out.print
        name = sc.nextLine();
        System.out.println("Enter your friends name");
        name1 = sc.next();
        System.out.println("Enter your father's name");
        name2 = sc.next();
        System.out.println("Enter your mother's name");
        name3 = sc.next();
        System.out.println("My name is " + name);  // using System.out.println
        System.out.println("My friend's name is " + name1);
        System.out.printf("My dad's name is %s\n", name2); //System.out.printf
        System.out.printf("My mother's name is %s\n", name3); //System.out.format
        System.out.printf("The value of a is %f \n", a);
        System.out.printf("The value of a is %8.2f ", a); //The output of this line will be _____5.64 where '_' =  1 space



    }
}
/*
Note: Nextline() cannot be used after next(). But when used the opposite way it works.
 */
