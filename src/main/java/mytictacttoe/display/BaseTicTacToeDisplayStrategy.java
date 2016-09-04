package mytictacttoe.display;

import mytictacttoe.boards.Board;

/**
 * Created by kmishra on 9/2/2016.
 */
public class BaseTicTacToeDisplayStrategy implements BoardDisplayStrategy {

    private Board board;

    @Override
    public void init(Board board) {
        this.board = board;
    }

    @Override
    public void display() {
        int[][] b = board.getBoard();
        String s = "";
        // iterate through the rows
        for( int i = 0 ; i < board.getN(); i ++ ) {
            s += getRowString(i, b);
        }
        System.err.println(s);
    }

    private String getRowString(int row, int[][] board)
    {
        String s = "" ;
        for( int i = 0 ; i < this.board.getN() ; i ++ )
        {
            switch(board[row][i]) {
                case 0: s += " " ;
                    break ;
                case 1: s += "X" ;
                    break ;
                case 2: s += "O" ;
            }

            if( i != this.board.getN()-1 )
            {
                s += " | " ;
            }
        }

        s += String.format("%" + 20 + "s", "");

        for( int i = 0 ; i < this.board.getN() ; i ++ )
        {
            s += row*this.board.getN()+i+1 ;

            if( i == this.board.getN()-1 ) {
                s += "\n";
            }
            else {
                s += " | " ;
            }
        }
        return s;
    }
}
