package tictactoe.player;

import tictactoe.Board;

public class MenacePlayer extends Player {

    // all matchboxes

    // matchboxes current game
    // moves current game

    public MenacePlayer(char myChar) {
        super(myChar);

        // initialize matchboxes
    }

    @Override
    public Board makeMove(Board board) {
        // search for the matchbox belonging to this board
            // create the matchbox if it can't be found

        // let the matchbox determine the next move

        return null;
    }

    @Override
    public void winner(Board board) {
        // learn from the result
    }
}
