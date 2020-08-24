package tictactoe.player.menace;

import tictactoe.Board;
import tictactoe.Result;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Matchbox {

    private final int INTIAL_KRAALTJES = 7;

    private Board board;
    private List<Integer> moveBeads;

    public Matchbox(Board board){
        this.board = board;
        List<Integer> availableMoves = board.availableMoves();
        moveBeads = new ArrayList<>();
        for (Integer ignored : availableMoves) {
            moveBeads.add(INTIAL_KRAALTJES);
        }
    }

    public int getMove(){
        int totalBeads = 0;
        for (Integer moveBead : moveBeads) {
            totalBeads += moveBead;
        }

        Random rng = new Random();

        int randomSelection = rng.nextInt(totalBeads);
        int moveIndex = 0;
        while (randomSelection > 0) {
            randomSelection -= moveBeads.get(moveIndex);
            moveIndex++;
        }

        return board.availableMoves().get(moveIndex);
    }

    public void learn(int move, Result result){
        // learn from the result i.e. add or remove beads for the move
    }

    public Board getBoard() {
        return board;
    }
}
