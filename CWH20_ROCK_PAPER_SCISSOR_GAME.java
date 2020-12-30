// ROCK PAPER SCISSOR GAME WITHOUT USING LOOP and if using loop uncomment line nos 12,13,19,20,21,22   and
package com.company;
import java.util.*;
//import java.util.Random;

public class CWH20_ROCK_PAPER_SCISSOR_GAME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myMove;

        // using while loop
        while(true)
        {
            //ask the user to enter their move
            System.out.println("Enter your move as rock, paper or scissor or quit");
            myMove = sc.nextLine();

            // condition to come out of while
            if(myMove.equals("quit"))
            {
                break;
            }


            //opponent moves
            int rand = (int)(Math.random()*3);
            String opponentMove = "";
            if(rand == 0)
            {
                opponentMove = "rock";
            }
            else if(rand == 1)
            {
                opponentMove = "paper";
            }
            else if(rand == 2)
            {
                opponentMove = "scissor";
            }
            //System.out.println(rand);
            System.out.println("opponentMove is "+ opponentMove);


            //Check for valid moves
            if((myMove.equals("rock"))||(myMove.equals("paper"))||(myMove.equals("scissor")))
            {
                //System.out.println("VALID")
                // check if user wins or lost or tied
                if (((myMove.equals("rock")) && (opponentMove.equals("paper"))) || ((myMove.equals("rock")) && (opponentMove.equals("scissor"))) || ((myMove.equals("scissor")) && (opponentMove.equals("paper"))) )
                {
                    System.out.println("You won!!");
                }
                else if (((myMove.equals("rock")) && (opponentMove.equals("rock"))) || ((myMove.equals("paper")) && (opponentMove.equals("paper"))) || ((myMove.equals("scissor")) && (opponentMove.equals("scissor"))) )
                {
                    System.out.println("Tied!!");
                }
                else
                {
                    System.out.println("You lost!!");
                }
            }
            else
            {
                System.out.println("Your move isn't valid!! Please enter a valid move.");
            }

        }
        System.out.println("Thanks for playing with me:)!!");



    }

}
