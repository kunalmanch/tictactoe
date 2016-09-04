package mytictacttoe.movestartegy;

import mytictacttoe.boards.Board;
import mytictacttoe.utils.Utils;

public class HumanMove implements MoveStrategy {

    @Override
    public void init(Board board) {

    }

    public int move() {
        String moveStr = Utils.getUserInput();
        return Integer.parseInt(moveStr);
    }
}