public class Board {
    Piece[][] board = new Piece[8][8];
    public Board(){

        for(int i=0; i<8; i++){
            board[0][i] = new Piece("Q", true, true, true, false, false);
        }
        for (int i=1;i<8;i++){
            for(int j = 0; j<8; j++){
                board[i][j] = new Piece("_", true);
            }
        }


    }

    public void setBoard() {

    }

    public void displayBoard(){
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){
                System.out.print(board[i][j].pieceLetter);
            }
            System.out.println(" ");
        }
    }
}
