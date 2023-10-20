import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Game {
    public static Board board;
    static Player p1;
    static Player p2;
    public Game() {
        board = new Board();
        board.setUpBoard();
        board.displayBoard();
        p1 = new Player(true);
        p2 = new Player(false);
        addToBoard(0,true);
        addToBoard(1,true);
        addToBoard(6,false);
        addToBoard(7,false);
        p1.takeTurn();

    }

    private static void addToBoard(int row, boolean white){
        if(white) {
            p1.pieces.addAll(Arrays.asList(board.board[row]));
        }
        else{
            p2.pieces.addAll(Arrays.asList(board.board[row]));
        }
    }
}