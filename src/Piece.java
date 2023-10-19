public class Piece {
    String pieceLetter;
    String letterColour;
    boolean isWhite;
    protected boolean canMoveStraight = false;
    protected boolean canMoveDiagonal = false;
    protected boolean canMoveHorse = false;
    protected boolean onlyMoveOneSquare = false;
    boolean isEmpty;
    int xPos;
    int yPos;


    public Piece(String pieceLetter, boolean isWhite, int xPos, int yPos){
        this.pieceLetter = pieceLetter;
        this.isWhite = isWhite;
        if(isWhite){
            letterColour = "W";
        }
        else{
            letterColour = "B";
        }
        switch(pieceLetter){
            case "Q":
                canMoveStraight = true;
                canMoveDiagonal = true;
                break;
            case "K":
                onlyMoveOneSquare = true;
                canMoveDiagonal = true;
                canMoveStraight = true;
                break;
            case "P":
                onlyMoveOneSquare = true;
                canMoveStraight = true;
                break;
            case "R":
                canMoveStraight = true;
                break;
            case "B":
                canMoveDiagonal = true;
            case "N":
                canMoveHorse = true;
                break;
        }
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public Piece(String pieceLetter, boolean isEmpty){
        this.pieceLetter = pieceLetter;
        this.isEmpty = isEmpty;
        letterColour = "_";
    }

    public void Move(int moveX, int moveY){
        System.out.println("test");
    }


}

