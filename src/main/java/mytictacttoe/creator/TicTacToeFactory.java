package mytictacttoe.creator;

import mytictacttoe.boards.Board;
import mytictacttoe.boards.TicTacToeBoard;
import mytictacttoe.descriptor.BaseTicTacToeMoveDescriptor;
import mytictacttoe.descriptor.MoveDescriptor;
import mytictacttoe.display.BaseTicTacToeDisplayStrategy;
import mytictacttoe.display.BoardDisplayStrategy;
import mytictacttoe.engine.BaseTicTacToeEngineImpl;
import mytictacttoe.engine.BoardGameEngine;
import mytictacttoe.game.BoardGame;
import mytictacttoe.game.TicTacToe;
import mytictacttoe.brain.BaseTicTacToeBrainImpl;
import mytictacttoe.brain.BoardGameBrain;

/**
 * Abstract factory for creating a scalable tictactoe game.
 * Future : boards/engines/brains can use factory design pattern for object creation.
 */
public class TicTacToeFactory implements BoardGameAbstractFactory {

    @Override
    public Board createBoard(int id) {
        return new TicTacToeBoard();
    }

    @Override
    public BoardGame createGame(BoardGameContext context) {//create game as per the context.
        //create board
        Board board = createBoard(context.boardTypeId);

        //create display strategy
        BoardDisplayStrategy displayStrategy = createBoardDisplay(context.boardDisplayId);
        displayStrategy.init(board);

        //init board with display strategy
        board.init(context.n, displayStrategy);

        //create brain
        BoardGameBrain brain = createGameBrain(context.boardGameBrainId);
        brain.init(board);

        //create move descriptor
        MoveDescriptor moveDescriptor = createDescriptor(context.descriptorId);

        //create engine
        BoardGameEngine engine = createEngine(context.boardGameEngineId);
        engine.init(board, brain, moveDescriptor, context.players);

        //create game
        BoardGame boardGame = createTicTacToe(context.boardGameId);
        boardGame.init(engine);

        return boardGame;
    }

    private BoardGame createTicTacToe(int boardGameId) {
        return new TicTacToe();
    }

    @Override
    public BoardGameEngine createEngine(int id) {
        return new BaseTicTacToeEngineImpl();
    }

    @Override
    public BoardGameBrain createGameBrain(int id) {
        return new BaseTicTacToeBrainImpl();
    }

    @Override
    public BoardDisplayStrategy createBoardDisplay(int id) {
        return new BaseTicTacToeDisplayStrategy();
    }

    @Override
    public MoveDescriptor createDescriptor(int id) {
        return new BaseTicTacToeMoveDescriptor();
    }
}
