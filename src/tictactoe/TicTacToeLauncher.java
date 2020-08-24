package tictactoe;

import tictactoe.player.HumanPlayer;
import tictactoe.player.MenacePlayer;
import tictactoe.player.Player;

public class TicTacToeLauncher {

    public static final char EMPTY = ' ';
    public static final char PLAYER1 = 'X';
    public static final char PLAYER2 = 'O';
    public static final char DRAW = '-';

    public static void main(String[] args) {
        Board board = new Board();

        Player player1 = new HumanPlayer(PLAYER1);
        Player player2 = new HumanPlayer(PLAYER2);

        int player1Wins = 0;
        int player2Wins = 0;
        int draws = 0;

        while(board.winner() != EMPTY) {
            if (board.getTurn() % 2 == 0) {
                board = player1.makeMove(board);
            } else {
                board = player2.makeMove(board);
            }
        }

        char winner = board.winner();
        switch (winner) {
            case PLAYER1:
                player1.winner(Result.WIN);
                player2.winner(Result.LOSE);
                player1Wins++;
                break;
            case PLAYER2:
                player1.winner(Result.LOSE);
                player2.winner(Result.WIN);
                player2Wins++;
                break;
            case DRAW:
            default:
                player1.winner(Result.DRAW);
                player2.winner(Result.DRAW);
                draws++;
        }

        // TODO print wins/draws?
        // TODO play again switch?
    }

}
