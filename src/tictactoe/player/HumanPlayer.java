package tictactoe.player;

import tictactoe.Board;

import java.util.Scanner;

public class HumanPlayer extends Player {

    Scanner keyboard;

    public HumanPlayer(char myChar){
        super(myChar);
        keyboard = new Scanner(System.in);
    }

    @Override
    public Board makeMove(Board board) {
        System.out.println(board);

        System.out.println("Welk vakje wil je een zet maken?");
        int zet = keyboard.nextInt();

        int zetX = (zet - 1) / 3;
        int zetY = (zet - 1) % 3;

        /*
        1 (0, 0) | 2 (0, 1) | 3 (0, 2)
        4 (1, 0) | 5 (1, 1) | 6 (1, 2)
        7 (2, 0) | 8 (2, 1) | 9 (2, 2)
         */

        board.makeMove(zetX, zetY, getMyChar());

        return board;
    }

    @Override
    public void winner(Board board) {
        System.out.println("Het spel is voorbij dit was het eind bord:");
        System.out.println(board);
    }
}
