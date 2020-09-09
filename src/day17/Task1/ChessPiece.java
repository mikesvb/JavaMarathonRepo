package day17.Task1;

public enum ChessPiece {
    KING_WHITE("♔", 100D),
    QUEEN_WHITE("♕", 9D),
    ROOK_WHITE("♖", 5D),
    BISHOP_WHITE("♗", 3.5),
    KNIGHT_WHITE("♘", 3D),
    PAWN_WHITE("♙", 1D),
    KING_BLACK("♚", 100D),
    QUEEN_BLACK("♛", 9D),
    ROOK_BLACK("♜", 5D),
    BISHOP_BLACK("♝", 3.5),
    KNIGHT_BLACK("♞", 3D),
    PAWN_BLACK("♟", 1D);
    private String name;
    private Double quality;

    ChessPiece(String name, Double quality){
        this.name=name;
        this.quality = quality;
    }
    public String toString(){
       return this.name;
    }
}
