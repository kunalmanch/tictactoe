package mytictacttoe.engine;

import mytictacttoe.boards.Board;
import mytictacttoe.descriptor.MoveDescriptor;
import mytictacttoe.brain.BoardConfig;
import mytictacttoe.player.Player;
import mytictacttoe.brain.BoardGameBrain;

/**
 * Created by kmishra on 9/1/2016.
 */
public interface BoardGameEngine {

    void init(Board board, BoardGameBrain boardGameBrain, MoveDescriptor moveDescriptor, Player[] players);

    boolean registerMove(int id, int move);

    BoardConfig getConfig();

    Player nextPlayer();

    void displayBoard();

    String  describeMove(int move);
}
