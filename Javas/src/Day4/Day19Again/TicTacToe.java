/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Day4.Day19Again;

import java.util.Scanner;

/**
 *
 * @author Thexe
 */
public class TicTacToe {
    int rows,cols;
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        //game.printBoard();
        game.printBoard();
        game.makeMove();

    }

    static String[][] boards = {
            {" "," "," "},
            {" "," ", " "},
            {" "," ", " "} 
    };

    String player1 = "X"; 
    String player2 = "O"; 

    int size = boards.length; 

    public void printBoard(){
        System.out.println("\n-----------------");

        for(int rows = 0; rows < size; rows++){//FOR ROWS
            for(int cols= 0; cols< size; cols++){//FOR COLS
                System.out.print("| "+ boards[rows][cols]+" | ");
            }
            System.out.println("\n-----------------");

        }
    }
    
    public void makeMove(){


        //TEMPORARY FOR TESTING
        TicTacToe test = new TicTacToe();
        //FOR TESTING
        int counter = 0;
        boolean win = false;
        
        while(!win){
            Scanner move = new Scanner(System.in);

            System.out.println("Enter Move: [index]:");
            System.out.print("Row: ");  rows = move.nextInt();
            System.out.print("Column: ");  cols = move.nextInt();
            checkSlot();
            boards[rows][cols] = player1;
            //counter++;

        //TEMPORARY
        test.printBoard();
        }

        
    }

    public boolean checkSlot(){
        if (!boards[rows][cols].equals(" ")) {
            System.out.println("\nSlot is Taken, Please Try Again");
        }
        return true;
    }

    
}
