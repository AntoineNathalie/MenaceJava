package tictactoe.player.menace;

import tictactoe.Board;

import java.util.ArrayList;
import java.util.List;

public class Matchbox {

    private final int INTIAL_KRAALTJES = 7;

    private Board board;
    private List<Integer> zetKraaltjes;

    public Matchbox(Board board){
        this.board = board;
        List<Integer> mogelijkeZetten = board.availableMoves();
        zetKraaltjes = new ArrayList<>();
        for (Integer integer : mogelijkeZetten) {
            zetKraaltjes.add(INTIAL_KRAALTJES);
        }
    }

    public int getMove(){
        /*
-------------
| 7 | 7 | 7 |
-------------
| 7 | 7 | 7 |
-------------
| 7 | 7 | 0 |
-------------
         */
        return 0;
    }

    public Board getBoard() {
        return board;
    }
}
