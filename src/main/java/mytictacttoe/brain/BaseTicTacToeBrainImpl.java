package mytictacttoe.brain;

import mytictacttoe.boards.Board;

/**
 * Created by kmishra on 9/1/2016.
 */
public class BaseTicTacToeBrainImpl implements BoardGameBrain {

    private Board board;

    @Override
    public void init(Board board) {
        this.board = board;
    }

    @Override
    public boolean isWinningMinorDiagonal() {
        int[][] b = board.getBoard();
        if( (b[0][0] != 0) && (b[0][0] == b[1][1]) && (b[0][0] == b[2][2] ) ) {
            return true;
        }

        return false;
    }

    @Override
    public boolean isWinningMajorDiaogonal() {
        int[][] b = board.getBoard();
        if( (b[2][0] != 0) && (b[2][0] == b[1][1]) && (b[2][0] == b[0][2] ) ) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isWinningRow() {
        int[][] b = board.getBoard();
        for(int i = 0; i < board.getN() ; i ++ ) {
            if( (b[i][0] != 0) && (b[i][0] == b[i][1]) && (b[i][0] == b[i][2] ) ) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isWinningColumn() {
        int[][] b = board.getBoard();
        for( int i = 0 ; i < board.getN() ; i ++ ) {
            if( (b[0][i] != 0) && (b[0][i] == b[1][i]) && (b[0][i] == b[2][i] ) ) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean playerHasWon() {
        if (isWinningRow()
                || isWinningColumn()
                || isWinningMajorDiaogonal()
                || isWinningMinorDiagonal()) return true;
        return false;
    }

    @Override
    public boolean draw() {
        int[][] b = board.getBoard();
        for (int i = 0; i < board.getN(); i++) {
            for (int j = 0; j < board.getN(); j++) {
                if (b[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
