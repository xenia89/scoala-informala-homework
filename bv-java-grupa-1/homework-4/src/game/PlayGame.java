package game;

import java.util.Scanner;

public class PlayGame {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Tic_Tac_Toe game= new Tic_Tac_Toe();
        game.createBoard();
        System.out.println("Let's play Tic Tac Toe!");
        do{
            System.out.println("Board layout");
            game.printBoard();
            int row;
            int col;
            do{
                System.out.println("Player "+game.getCurrentPlayer()+" enter an empty row and am empty column ");
                row=scan.nextInt()-1;
                col=scan.nextInt()-1;
                //game.changePlayer();
            }
           while(!(game.placeCorrectChar(row,col)));
                game.changePlayer();
        }
        while((!game.checkWin())&&(!game.checkBoardFull()));
        if ((game.checkBoardFull())&&(!game.checkWin())){
            System.out.println("game is a tie");
        }
        else{
            System.out.println("This is the current board");
            game.printBoard();
            game.changePlayer();
            System.out.println(game.getCurrentPlayer()+" wins!");
        }
    }
}
