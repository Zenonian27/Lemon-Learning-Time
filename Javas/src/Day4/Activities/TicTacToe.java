/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 *
 * @author Thexe
 */
public class TicTacToe {

        String[][] board = {
            {" "," "," "},
            {" "," "," "},
            {" "," "," "}
        };
        
        String player = "X";
    
        public void printBoard(){
            System.out.println("-------------");
            for(int i=0;i<board.length;i++){
                System.out.print("| ");
                for(int j=0;j<board[i].length;j++){
                    System.out.print(board[i][j]+ " | ");
                }
                System.out.println("\n-------------");
            }
        }
    
        public static void main(String[] args){
            TicTacToe tic = new TicTacToe();
            tic.playGame();
        }
    
        public void playGame() {
            while (true) {
                printBoard();
                makeMove();
    
                // check win
                if (checkWin()) {
                    printBoard();
                    System.out.println("Player " + player + " wins!");
                    break;
                }
    
                // switch player
                if (player.equals("X")) {
                    player = "O";
                } else {
                    player = "X";
                }
            }
        }
    
        public void makeMove(){
            Scanner in = new Scanner(System.in);
            int r, c;
            while (true) {
                System.out.println("Player " + player + ", enter your move:");
                System.out.print("Row (0-2): "); r = in.nextInt();
                System.out.print("Col (0-2): "); c = in.nextInt();
    
                if (r >= 0 && r < 3 && c >= 0 && c < 3 && board[r][c].equals(" ")) {
                    board[r][c] = player;
                    break;
                } else {
                    System.out.println("Invalid move, try again.");
                }
            }
        }
    
        public boolean checkWin() {
            // rows
            if (board[0][0].equals(player) && board[0][1].equals(player) && board[0][2].equals(player)) 
                return true;
            else if (board[1][0].equals(player) && board[1][1].equals(player) && board[1][2].equals(player)) 
                return true;
            else if (board[2][0].equals(player) && board[2][1].equals(player) && board[2][2].equals(player)) 
                return true;
            // cols
            else if (board[0][0].equals(player) && board[1][0].equals(player) && board[2][0].equals(player)) 
                return true;
            else if (board[0][1].equals(player) && board[1][1].equals(player) && board[2][1].equals(player)) 
                return true;
            else if (board[0][2].equals(player) && board[1][2].equals(player) && board[2][2].equals(player)) 
                return true;
            // diagonals
            else if (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) 
                return true;
            else if (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player)) 
                return true;
            else 
                return false;
        }
    
}
