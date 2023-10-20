import java.util.ArrayList;
import java.util.Scanner;


public class Player {
    boolean isWhite;
    ArrayList<Piece> pieces = new ArrayList<Piece>();



    public Player(boolean isWhite){
        this.isWhite = isWhite;
    }
    public void takeTurn(){

        System.out.println(Game.board.board[0][0].pieceLetter);
        Scanner s = new Scanner(System.in);
        boolean validMove = true;
        String pieceFrom;
        String pieceTo;
        do {
            System.out.println("Which piece to move (put as xy):");
            pieceFrom = s.nextLine();
            System.out.println("Where to move piece to (put as xy):");
            pieceTo = s.nextLine();
            Piece pieceToMove = Game.board.board[Character.getNumericValue(pieceFrom.charAt(0))][Character.getNumericValue(pieceFrom.charAt(1))];
            System.out.println(pieceToMove.letterColour+pieceToMove.pieceLetter);
        }while(validMove);

    }
}
