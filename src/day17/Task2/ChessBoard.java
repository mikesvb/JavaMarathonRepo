package day17.Task2;

public class ChessBoard {
    ChessPiece[][] chessPiece;
    public ChessBoard(ChessPiece chessPiece[][]){
        this.chessPiece=chessPiece;
    }

    public void print(){

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chessPiece[i][j]);
            }
            System.out.print("\n");
        }

    }
}
