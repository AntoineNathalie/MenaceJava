package tictactoe.player;

import tictactoe.Board;
import tictactoe.Result;

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
        int move = keyboard.nextInt();

        int moveX = (move - 1) / 3;
        int moveY = (move - 1) % 3;

        /*
        1 (0, 0) | 2 (0, 1) | 3 (0, 2)
        4 (1, 0) | 5 (1, 1) | 6 (1, 2)
        7 (2, 0) | 8 (2, 1) | 9 (2, 2)
         */

        board.makeMove(moveX, moveY, getMyChar());

        return board;
    }

    @Override
    public void winner(Result result) {
        switch (result) {
            case LOSE:
                System.out.printf("Helaas %c, je hebt verloren.\n", getMyChar());
                break;
            case WIN:
                System.out.printf("Gefeliciteerd %c, je hebt gewonnen!\n", getMyChar());
                break;
            case DRAW:
                System.out.println("Jullie hebben gelijk gespeeld.");
                break;
        }
    }
}
