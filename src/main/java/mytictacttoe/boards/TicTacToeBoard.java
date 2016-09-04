package mytictacttoe.boards;

import mytictacttoe.display.BoardDisplayStrategy;

/**
 * Created by kmishra on 9/1/2016.
 */
public class TicTacToeBoard implements Board {

    private int n;
    private int[][] board;
    private BoardDisplayStrategy displayStrategy;

    public int getN() {
        return n;
    }

    @Override
    public void display() {
        displayStrategy.display();
    }

    @Override
    public void init(int n, BoardDisplayStrategy displayStrategy) {
        this.n = n;
        board = new int[n][n];
        this.displayStrategy = displayStrategy;
    }

    public int[][] getBoard() {
        return board;
    }

    public boolean isMoveValid(int move) {
        if (move > n * n) return false;
        int i = getXCoord(move);
        int j = getYCoord(move);
        if (i < 0 || i >= n) return false;
        if (j < 0 || j >= n) return false;
        return board[i][j] == 0;
    }

    @Override
    public int getXCoord(int move) {
        return (move - 1) / n;
    }

    @Override
    public int getYCoord(int move) {
        return (move - 1) % n;
    }

    public void setMove(int id, int move) {
        int i = getXCoord(move);
        int j = getYCoord(move);
        board[i][j] = id;
    }
}
