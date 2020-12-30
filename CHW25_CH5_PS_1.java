package com.company;

public class CHW25_CH5_PS_1 {
    public static void main(String[] args) {

        //inverted right angle triangle
//        for(int i=4;i>0;i--)
//        {
//
//            for(int j=i; j>0;j--)
//            {
//            /*for spaced stars
//            System.out.print("*"+" ");*/
//                //for non spaced stars
//                System.out.print("*"+" ");
//            }
//            System.out.println();



        //right angle triangle
        for(int i=0;i<4;i++)
        {
            //System.out.println(i);

            for(int j=1; j<=i+1;j++)
            {
                //System.out.println(j);
            /*for spaced stars
            System.out.print("*"+" ");*/
                //for non spaced stars
                System.out.print("*"+" ");
                // for testing purpose
                // System.out.print(j+"*"+" ");
            }
            System.out.println();

        }
    }
}
