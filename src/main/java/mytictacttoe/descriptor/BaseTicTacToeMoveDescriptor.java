package mytictacttoe.descriptor;

/**
 * Descriptor for 3x3 tictactoe board move.
 */
public class BaseTicTacToeMoveDescriptor implements MoveDescriptor {

    @Override
    public String describe(int move) {
        String str = "";
        if( move == 5 ) {
            str = "center" ;
            return str ;
        }

        if( (move-1)/3 == 0 ) {
            str += "upper " ;
        }
        else if( (move-1)/3 == 1 ) {
            str += "middle " ;
        }
        else
            str += "lower " ;

        if( (move-1) % 3 == 0 )
            str += "left" ;
        else if( (move-1)%3 == 1 )
            str += "middle" ;
        else
            str += "right" ;

        return str ;
    }
}
