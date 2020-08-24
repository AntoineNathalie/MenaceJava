package tictactoe.player;

import tictactoe.Board;

public class MenacePlayer extends Player {

    // matchboxes stapel opslaan per beurt

    // matchboxes spel
    // zetten spel

    public MenacePlayer(char myChar) {
        super(myChar);

        // matchboxes aanmaken?
    }

    @Override
    public Board makeMove(Board board) {
        // zoek de matchbox bij het huidige board
            // eventueel maak de matchbox aan als die nog niet bestaat

        // vraag de matchbox om een zet

        return null;
    }

    @Override
    public void winner(Board board) {
        // ik wil leren van de eindstand
    }
}
