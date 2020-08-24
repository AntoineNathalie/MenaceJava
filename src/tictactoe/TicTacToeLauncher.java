package tictactoe;

import tictactoe.player.HumanPlayer;
import tictactoe.player.MenacePlayer;
import tictactoe.player.Player;

public class TicTacToeLauncher {

    public static void main(String[] args) {
        Board board = new Board();

        Player player1 = new MenacePlayer('X');
        Player player2 = new HumanPlayer('O');

        while(!board.winner()) {
            if (board.getTurn() % 2 == 0) {
                board = player1.makeMove(board);
            } else {
                board = player2.makeMove(board);
            }
        }

        player1.winner(board);
        player2.winner(board);

        System.out.println("Er is een winnaar!");
    }

}
