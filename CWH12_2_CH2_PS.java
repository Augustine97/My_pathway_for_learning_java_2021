package com.company;
import java.util.*;

public class CWH12_2_CH2_PS {
    public static void main(String[] args) {
        char grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade");
        grade = sc.next().charAt(0); // there is no other scanner class  for character datatype
        //encryption
        System.out.println("Encryption");
        grade = (char) (grade + 8);
        System.out.println(grade);
        //decryption
        System.out.println("Decryption");
        grade = (char) (grade - 8);
        System.out.println(grade);
        System.out.println("Done");





    }
}
