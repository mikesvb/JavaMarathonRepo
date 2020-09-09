package day17.Task1;

import java.lang.reflect.Array;

public class Task1 {
    public static void main(String[] args) {
        String[] array = new String[8];
        for (int i = 0; i < 8; i++) {

            if(i<=3){
                array[i]= ChessPiece.PAWN_WHITE.toString();
            }else{
                array[i]= ChessPiece.ROOK_BLACK.toString();
            }
        }
        for (String element:array){
            System.out.print(element + " ");
        }
    }
}
