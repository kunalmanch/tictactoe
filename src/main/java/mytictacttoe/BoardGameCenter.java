package mytictacttoe;

import mytictacttoe.creator.BoardGameAbstractFactory;
import mytictacttoe.creator.BoardGameContext;
import mytictacttoe.creator.TicTacToeFactory;
import mytictacttoe.game.BoardGame;
import mytictacttoe.player.Player;
import mytictacttoe.player.PlayerCreator;
import mytictacttoe.player.PlayerType;

/**
 * Created by kmishra on 9/2/2016.
 */
public class BoardGameCenter {


    //this can also be further modularized.
    public static void main(String[] ar) {
        BoardGameContext context = createBaseTicTacToeContext();
        BoardGameAbstractFactory ticTacToeFactory = instantiateFactory(context);
        BoardGame boardGame = ticTacToeFactory.createGame(context);
        boardGame.play();
    }

    private static BoardGameAbstractFactory instantiateFactory(BoardGameContext context) {
        return new TicTacToeFactory();
    }

    private static BoardGameContext createBaseTicTacToeContext() {
        BoardGameContext context = new BoardGameContext();
        Player[] players = new Player[2];
        players[0] = PlayerCreator.createPlayer("Kunal", PlayerType.HUMAN);
        players[1] = PlayerCreator.createPlayer("AI", PlayerType.COMPUTER);
        context.setPlayers(players);
        context.setN(3);
        return context;
    }
}
