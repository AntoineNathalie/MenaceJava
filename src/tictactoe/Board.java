package tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {

    private char[][] board;
    private int turn;

    public Board(){
        board = new char[3][3];

        // initialiseer het bord
        for (int rij = 0; rij < board.length; rij++) {
            for (int kolom = 0; kolom < board[rij].length; kolom++) {
                board[rij][kolom] = ' ';
            }
        }

        turn = 0;
    }

    public List<Integer> availableMoves() {
        List<Integer> availableMoves = new ArrayList<>();
        for (int row = 0; row < this.board.length; row++) {
            for (int column = 0; column < this.board[row].length; column++) {
                if (this.board[row][column] == ' ') {
                    availableMoves.add((row * 3) + column + 1);
                }
            }
        }
        return availableMoves;
    }

    public void makeMove(int x, int y, char player) {
        if (board[x][y] == ' ') {
            board[x][y] = player;
            turn++;
        } else {
            System.out.println(availableMoves());
        }
    }

    public int getTurn() {
        return turn;
    }

    @Override
    public String toString() {
        String returnString = "-------------\n";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                returnString += "| " + board[i][j] + " ";
            }
            returnString += "|\n-------------\n";
        }
        return returnString;
    }

    public boolean winner() {

        /*
        1 (0, 0) | 2 (0, 1) | 3 (0, 2)
        4 (1, 0) | 5 (1, 1) | 6 (1, 2)
        7 (2, 0) | 8 (2, 1) | 9 (2, 2)
         */

        // TODO kolommen en diagonalen
        return
            (board[0][0] != ' ' && board[0][0] == board[0][1] && board[0][0] == board[0][2]) ||
            (board[1][0] != ' ' && board[1][0] == board[1][1] && board[1][0] == board[1][2]) ||
            (board[2][0] != ' ' && board[2][0] == board[2][1] && board[2][0] == board[2][2]);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board1 = (Board) o;
        return Arrays.equals(board, board1.board);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(board);
    }
}
