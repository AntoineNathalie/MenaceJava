package tictactoe.player;

import tictactoe.Board;

import java.util.List;
import java.util.Random;

public class RandomPlayer extends Player {

    public RandomPlayer(char myChar) {
        super(myChar);
    }

    @Override
    public Board makeMove(Board board) {
        Random rng = new Random();
        List<Integer> availableMoves = board.availableMoves();
        int move = availableMoves.get(rng.nextInt(availableMoves.size()));

        int moveX = (move - 1) / 3;
        int moveY = (move - 1) % 3;
        board.makeMove(moveX, moveY, getMyChar());

        return board;
    }

}
