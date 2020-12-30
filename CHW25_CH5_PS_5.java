package com.company;
import java.util.*;
public class CHW25_CH5_PS_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        if(n==0)
        {
            System.out.println("Factorial of "+n+" is "+fact+".");

        }
        else
            {
                for(int i=n;i>0;i--)
                {
                    fact= fact*i;
                    //System.out.println(i);
                    //System.out.println(fact);
                }
                System.out.println("Factorial of "+n+" is "+fact+".");

            }


    }
}
