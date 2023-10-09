public class Board {
    public Board(){
        Piece[][] board = new Piece[8][8];
        for(Piece p: board[0]){
            p = new Piece();
        }
        for (int i=1;i<8;i++){
            for(Piece p: board[i]){
                p = new BlankPiece();
            }
        }
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){
                System.out.print(board[i][j].getPieceLetter());
            }
            System.out.println(" ");
        }
    }
}
