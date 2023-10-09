public class Piece {
    public String getPieceLetter() {
        return pieceLetter;
    }

    private String pieceLetter = "A";
}

Class BlankPiece extends Piece{
    String pieceLetter = "E";
}
