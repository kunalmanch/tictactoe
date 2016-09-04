package mytictacttoe.movestartegy;

import mytictacttoe.boards.Board;

/**
 * Created by kmishra on 8/31/2016.
 */
public class SimpleMoveStrategy implements MoveStrategy {

    private Board ticTacToeBoard;

    @Override
    public void init(Board board) {
        ticTacToeBoard = board;
    }

    public int move() {
        int[][] b = ticTacToeBoard.getBoard();
        for(int i = 0; i < ticTacToeBoard.getN(); i++) {
            for(int j = 0; j < ticTacToeBoard.getN(); j++) {
                if(b[i][j] == 0) return (i * ticTacToeBoard.getN() + j + 1);
            }
        }
        return 0;
    }
}
