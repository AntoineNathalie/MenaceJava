package tictactoe.player;

import tictactoe.Board;

public abstract class Player {

    private char myChar;

    public Player(char myChar){
        this.myChar = myChar;
    }

    public abstract Board makeMove(Board board);

    public void winner(Board board){};

    public char getMyChar(){
        return myChar;
    }

}
