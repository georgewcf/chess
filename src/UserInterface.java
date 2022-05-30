import chess.ChessPiece;

public class UserInterface {

    public static void printBoard(ChessPiece[][] pieces){
        for (int i = 0; i < pieces.length; i++){
            System.out.print((8 - i) + " ");
           for (int j = 0; j < pieces.length; j++){
               printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        lettersCenter();
    }

    private static void printPiece(ChessPiece piece){
        if (piece != null){
            System.out.print(piece);
        } else {
            System.out.print(" * ");
        }
        System.out.print(" ");
    }

    private static void lettersCenter() {
        System.out.print("   A   B   C   D   E   F   G   H");
    }
}
