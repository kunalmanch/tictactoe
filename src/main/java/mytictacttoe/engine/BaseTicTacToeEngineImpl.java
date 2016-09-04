package mytictacttoe.engine;

import mytictacttoe.boards.Board;
import mytictacttoe.descriptor.MoveDescriptor;
import mytictacttoe.brain.BoardConfig;
import mytictacttoe.player.Player;
import mytictacttoe.brain.BoardGameBrain;

import java.util.Arrays;

/**
 * Created by kmishra on 9/1/2016.
 */
public class BaseTicTacToeEngineImpl implements BoardGameEngine {

    private Board ticTacToeBoard;
    private int turn;//should be an interface to manage turns "TurnManager".
    private Player[] players;
    private BoardGameBrain ticTacToeBrain;
    private MoveDescriptor moveDescriptor;

    @Override
    public void init(Board ticTacToeBoard, BoardGameBrain boardGameResults, MoveDescriptor moveDescriptor, Player[] players) {
        this.ticTacToeBoard = ticTacToeBoard;
        this.players = players;
        for (Player p : players) {
            p.getMoveStrategy().init(ticTacToeBoard);
        }
        Arrays.sort(this.players, (p1, p2) -> p1.getPlayerOrder() - p2.getPlayerOrder());
        this.ticTacToeBrain = boardGameResults;
        this.moveDescriptor = moveDescriptor;
    }

    @Override
    public boolean registerMove(int id, int move) {
        if (!ticTacToeBoard.isMoveValid(move)) return false;
        ticTacToeBoard.setMove(id, move);
        return true;
    }

    @Override
    public BoardConfig getConfig() {
        if (ticTacToeBrain.playerHasWon()) return BoardConfig.WIN;
        if (ticTacToeBrain.draw()) return BoardConfig.DRAW;
        return BoardConfig.NONE;
    }

    @Override
    public Player nextPlayer() {
        return players[turn++ % players.length];
    }

    @Override
    public void displayBoard() {
        ticTacToeBoard.display();
    }

    @Override
    public String describeMove(int move) {
        return moveDescriptor.describe(move);
    }
}
