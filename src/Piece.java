public class Piece {
    String pieceLetter;
    boolean isWhite;
    protected boolean canMoveStraight = false;
    protected boolean canMoveDiagonal = false;
    protected boolean canMoveHorse = false;
    protected boolean onlyMoveOneSquare;
    boolean isEmpty;


    public Piece(String pieceLetter, boolean isWhite, boolean canMoveStraight,boolean canMoveDiagonal,boolean canMoveHorse,boolean onlyMoveOneSquare){
        this.pieceLetter = pieceLetter;
        this.isWhite = isWhite;
        this.canMoveStraight = canMoveStraight;
        this.canMoveDiagonal = canMoveDiagonal;
        this.canMoveHorse = canMoveHorse;
        this.onlyMoveOneSquare = onlyMoveOneSquare;
    }
    public Piece(String pieceLetter, boolean isEmpty){
        this.pieceLetter = pieceLetter;
        this.isEmpty = isEmpty;
    }

    public void Move(int moveX, int moveY){
        System.out.println("test");
    }


}

