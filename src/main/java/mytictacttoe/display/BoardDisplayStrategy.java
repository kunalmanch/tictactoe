package mytictacttoe.display;

import mytictacttoe.boards.Board;

/**
 * Created by kmishra on 9/2/2016.
 */
public interface BoardDisplayStrategy {

    void init(Board board);
    void display();
}
