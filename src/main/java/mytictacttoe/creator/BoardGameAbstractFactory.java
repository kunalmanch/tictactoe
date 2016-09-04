package mytictacttoe.creator;

import mytictacttoe.boards.Board;
import mytictacttoe.descriptor.MoveDescriptor;
import mytictacttoe.display.BoardDisplayStrategy;
import mytictacttoe.engine.BoardGameEngine;
import mytictacttoe.game.BoardGame;
import mytictacttoe.brain.BoardGameBrain;

/**
 * Created by kmishra on 9/2/2016.
 */
public interface BoardGameAbstractFactory {

    Board createBoard(int id);

    BoardGame createGame(BoardGameContext context);

    BoardGameEngine createEngine(int id);

    BoardGameBrain createGameBrain(int id);

    BoardDisplayStrategy createBoardDisplay(int id);

    MoveDescriptor createDescriptor(int id);
}
