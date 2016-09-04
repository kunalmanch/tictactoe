package mytictacttoe.player;

import mytictacttoe.movestartegy.HumanMove;
import mytictacttoe.movestartegy.MoveStrategy;
import mytictacttoe.movestartegy.SimpleMoveStrategy;

/**
 * Created by kmishra on 9/1/2016.
 */
public class PlayerCreator {

    private static int id = 1;

    public static Player createPlayer(String pname, PlayerType playerType) {
        MoveStrategy moveStrategy = playerType == PlayerType.HUMAN ? new HumanMove() : new SimpleMoveStrategy();
        return new Player(pname, id, playerType, id++, moveStrategy);
    }
}
