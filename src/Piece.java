public class Piece {
    private String pieceLetter;
    protected boolean canMoveStraight = false;
    protected boolean canMoveDiagonal = false;
    protected boolean canMoveHorse = false;
    protected boolean canMoveOneSquare = false;


    public String getPieceLetter() {
        return pieceLetter;
    }

    public void Move(int moveX, int moveY){
        System.out.println("test");
    }


}

