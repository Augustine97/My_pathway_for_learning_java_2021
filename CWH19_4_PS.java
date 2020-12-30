package com.company;
import java.util.*;

public class CWH19_4_PS {
    public static void main(String[] args) {



        //problem2
       float m1,m2,m3,p1,p2,p3,tp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of first subject out of 100");
        m1 = sc.nextFloat();
        System.out.println("Enter the marks of second subject out of 100");
        m2 = sc.nextFloat();
        System.out.println("Enter the marks of third subject out of 100");
        m3 = sc.nextFloat();
        p1 = (m1*100)/100;
        p2 = (m2*100)/100;
        p3 = (m3*100)/100;
        tp = ((m1+m2+m3)*100)/300;
        if(p1>33.0f && p2>33.0f && p3>33.0f && tp>=40.0f){
            System.out.println("The student has pass");
        }
        else{
            System.out.println("The student has failed");
        }
        System.out.println("--------");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(tp);




        //problem3 (income tax)(VIM)
        float tax = 0;
        float income ;
        income = sc.nextFloat();
        if (income<2.5f){
            tax = tax + 0;
        }
        else if(income>=2.5f && income<5.0f) {
            tax = tax + 0.05f*(income-2.5f);

        }
        else if(income>=5.0f && income<10.0f) {
            tax = tax + 0.05f*(5.0f-2.5f);
            tax = tax + 0.2f*(income-7.5f);

        }
        else if(income>=10.0f) {
            tax = tax + 0.05f*(5.0f-2.5f);
            tax = tax + 0.2f*(10.0f-5.0f);
            tax = tax + 0.3f *(income - 10.0f);

        }
        System.out.println(tax);





        // problem 4
        int day;
        day = sc.nextInt();
        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
        }



    }
}
