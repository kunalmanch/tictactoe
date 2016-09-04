package mytictacttoe.game;

import mytictacttoe.brain.BoardConfig;
import mytictacttoe.engine.BoardGameEngine;
import mytictacttoe.player.Player;

/**
 * TicTacToe BoardGame room.
 */
public class TicTacToe implements BoardGame {

    BoardGameEngine boardGameEngine;

    @Override
    public void init(BoardGameEngine boardGameEngine) {
        this.boardGameEngine = boardGameEngine;
    }

    @Override
    public void play() {
        BoardConfig w;
        Player player;
        System.err.println("Start Playing TicTacToe!!");
        boardGameEngine.displayBoard();
        do {
            player = boardGameEngine.nextPlayer();
            System.err.println(player.getName() + " make your move : ");
            int move;
            while (true) {
                move = player.getMove();
                if (boardGameEngine.registerMove(player.getPlayerId(), move)) {
                    break;
                } else {
                    System.err.println("Invalid Move!!! Try again...");
                }
            }
            System.err.println(player.getName() + " made a move to " + boardGameEngine.describeMove(move));
            boardGameEngine.displayBoard();
        } while ((w = boardGameEngine.getConfig()) == BoardConfig.NONE);

        if (w == BoardConfig.WIN) {
            System.err.println(player.getName() + " won!");
        } else {
            System.err.println("It is a draw!");
        }
    }

}
