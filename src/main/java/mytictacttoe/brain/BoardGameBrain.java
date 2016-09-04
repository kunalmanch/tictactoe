package mytictacttoe.brain;

import mytictacttoe.boards.Board;

/**
 * Created by kmishra on 9/1/2016.
 */
public interface BoardGameBrain {

    void init(Board board);

    boolean playerHasWon();

    boolean draw();

    boolean isWinningMinorDiagonal();
    boolean isWinningMajorDiaogonal();
    boolean isWinningRow();
    boolean isWinningColumn();
}
