package mytictacttoe.game;

import mytictacttoe.engine.BoardGameEngine;

/**
 * Created by kmishra on 9/1/2016.
 */
public interface BoardGame {

    void init(BoardGameEngine boardGameEngine);

    void play();
}
