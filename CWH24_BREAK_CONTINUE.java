package com.company;

public class CWH24_BREAK_CONTINUE {
    public static void main(String[] args) {


        //concept of break for for loop
//        for(int i=0;i<=5;i++)
//        {
//            System.out.println("Java is great");
//            if(i<=2)
//            {
//                System.out.println("Done with loop");
//                break;
//            }
//
//        }



        //concept of break using while loop
        //      int i=0;
//        while(i<5)
//        {
//            System.out.println("Java is great but takes time");
//            i++;
//            if (i==2)
//            {
//                System.out.println("done with while loop");
//                break;
//            }
//        }
//


        //concept of break using do while loop
//        int i = 0;
//        do {
//
//            System.out.println("Manu is a developer.");
//            i++;
//            if(i==2)
//            {
//                break;
//            }
//
//        }while(i<=5);

//concept of continue using for loop
        for(int i=0;i<5;i++)
        {

            if(i==2)
            {
                System.out.println("2 is skipped because of continue");
                continue;
            }
            System.out.println(i+"."+"Java is great");

        }


    }
}


