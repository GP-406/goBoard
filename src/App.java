//package com.example.project;

//go pieces ◯ ●
import java.util.Scanner;
import java.util.random;

public class App {
    static int boardSize = 9;
    static String[][] goBoard = new String[boardSize][boardSize];

        public static void main(String[] args) {
        Boolean cont = true, turn = true;
        // The condition on which our game loop hangs
        int moveX, moveY;
        // Placeholders for the coordinates from the user
        String white = "●", black = "◯";

        Scanner userMove = new Scanner(System.in);
        // Scanner object for getting user input, parsing it
        while (cont == true){

            //System.out.println("\n" + ((turn) ? "Black":"White")) + "'s turn to move!\n\n";
            if (turn == true){
                System.out.println("Player 1, Please enter the X coordinate of your move.");
                moveX = userMove.nextInt();
                System.out.println("Now enter the Y coordinate of your move.");
                moveY = userMove.nextInt();
                System.out.println("Thank you.");
            //Asks player 1 for x and y coordinates of move
            }
            else {System.out.println("Player 2, Please enter the X coordinate of your move.");
            moveX = userMove.nextInt();
            System.out.println("Now enter the Y coordinate of your move.");
            moveY = userMove.nextInt();
            System.out.println("Thank you.");}
            
            // Checks if move is out of bounds
            if (moveX < 0 || moveY < 0 || moveX > 8 || moveY > 8) {
            System.out.println("Invalid move. Please choose again.");
                continue;}
            
            // Checks if move is taken
            if (goBoard[moveX][moveY] == null && turn == true) {goBoard[moveX][moveY] = black;}
            else if (goBoard[moveX][moveY] == null && turn == false) {goBoard[moveX][moveY] = white;}
            else {System.out.println("Invalid move. Please choose again.");
                continue;}

            // Prints board with new move after every move
            for (int i = 0; i < goBoard.length; i++) {
                for(int j = 0; j <goBoard.length; j++) {
                    if (goBoard[i][j] == null) {
                        System.out.print("+");
                    }
                    else{  System.out.print(goBoard[i][j]);}
                    if(j < goBoard.length -1);
                        System.out.print(" ");
                }
                
                System.out.println();
                //
                turn = !turn;
            }
        }
    };

}
