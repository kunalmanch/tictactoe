package mytictacttoe.creator;

import mytictacttoe.player.Player;

/**
 * Games are created as per this context object.
 */
public class BoardGameContext {

    int boardGameId;
    int boardTypeId;
    int n;
    int boardGameEngineId;
    int boardGameBrainId;
    int boardDisplayId;
    Player[] players;
    int descriptorId;

    public BoardGameContext() {

    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public void setN(int n) {
        this.n = n;
    }
}
