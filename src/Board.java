import java.util.Arrays;

public class Board {
    Piece[][] board = new Piece[8][8];
    public Board(){

    }

    public void setUpBoard() {
        boolean white = false;
        for (int row=7;row>=0;row--){
            if(row==1){
                white = true;
            }
            if(row==0 || row==7){
                board[row][0] = new Piece("R", white, row ,0);
                board[row][7] = new Piece("R", white, row ,0);
                board[row][1] = new Piece("N", white, row ,0);
                board[row][6] = new Piece("N", white, row ,0);
                board[row][2] = new Piece("B", white, row ,0);
                board[row][5] = new Piece("B", white, row ,0);
                board[row][3] = new Piece("Q", white, row ,0);
                board[row][4] = new Piece("K", white, row ,0);
                continue;
            }
            for(int column = 0; column<=7; column++){
                System.out.println(row);
                if(row == 1 || row == 6){
                    board[row][column] = new Piece("P", white, row ,column);
                }
                else{
                    board[row][column] = new Piece("_", true);
                }
            }
        }
    }

    public void displayBoard(){
        for(int i = 7; i>=0; i--){
            for(int j = 0; j<8; j++){
                System.out.print(board[i][j].letterColour + board[i][j].pieceLetter + " ");
            }
            System.out.println();
        }
    }
}
