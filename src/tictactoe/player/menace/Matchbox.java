package tictactoe.player.menace;

import tictactoe.Board;
import tictactoe.Result;

import java.util.ArrayList;
import java.util.List;

public class Matchbox {

    private final int INTIAL_KRAALTJES = 7;

    private Board board;
    private List<Integer> moveBeads;

    public Matchbox(Board board){
        this.board = board;
        List<Integer> availableMoves = board.availableMoves();
        moveBeads = new ArrayList<>();
        for (Integer integer : availableMoves) {
            moveBeads.add(INTIAL_KRAALTJES);
        }
    }

    public int getMove(){
        // select a (weighed) random move
        return 0;
    }

    public void learn(int move, Result result){
        // learn from the result i.e. add or remove beads for the move
    }

    public Board getBoard() {
        return board;
    }
}
