package mytictacttoe.player;

import mytictacttoe.movestartegy.MoveStrategy;

/**
 * Created by kmishra on 8/31/2016.
 */
public class Player {

    private String name ;
    private int playerId;
    private PlayerType playerType;
    private int playerOrder;
    private MoveStrategy moveStrategy;

    Player(String pname, int id, PlayerType playerType, int order, MoveStrategy moveStrategy) {
        this.name = pname ;
        this.playerId = id;
        this.playerType = playerType;
        this.playerOrder = order;
        this.moveStrategy = moveStrategy ;
    }

    public String getName() {
        return name ;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public int getPlayerId() {
        return playerId;
    }

    public int getMove() {
        return moveStrategy.move();
    }

    public int getPlayerOrder() {
        return playerOrder;
    }

    public MoveStrategy getMoveStrategy() {
        return moveStrategy;
    }
}