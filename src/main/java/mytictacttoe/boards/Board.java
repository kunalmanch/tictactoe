package mytictacttoe.boards;

import mytictacttoe.display.BoardDisplayStrategy;

/**
 * Created by kmishra on 9/1/2016.
 */
public interface Board {

    void init(int n, BoardDisplayStrategy displayStrategy);

    int[][] getBoard();

    void setMove(int id, int move);

    boolean isMoveValid(int move);

    int getXCoord(int move);

    int getYCoord(int move);

    int getN();

    void display();
}
