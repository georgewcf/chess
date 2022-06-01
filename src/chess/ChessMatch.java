package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.*;
import enums.Color;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        this.board = new Board(8,8);
        initalSetup();
    }
    public ChessPiece[][] getPieces(){
        ChessPiece[][] matriz = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++){

            for (int j = 0; j < board.getColumns(); j++){
                matriz[i][j] = (ChessPiece)board.piece(i, j);
            }
        }
        return matriz;
    }

    private void initalSetup(){
        // -> PEÇAS NEGRAS <-

        //TORRES
        board.placePiece(new Rook(board, Color.BLACK), new Position(0, 0));
        board.placePiece(new Rook(board, Color.BLACK), new Position(0, 7));
        //CAVALOS
        board.placePiece(new Knight(board, Color.BLACK), new Position(0, 1));
        board.placePiece(new Knight(board, Color.BLACK), new Position(0, 6));
        //BISPOS
        board.placePiece(new Bishop(board, Color.BLACK), new Position(0, 2));
        board.placePiece(new Bishop(board, Color.BLACK), new Position(0, 5));
        //DAMA
        board.placePiece(new Queen(board, Color.BLACK), new Position(0, 3));
        //REI
        board.placePiece(new King(board, Color.BLACK), new Position(0 ,4));

        // -> PEÇAS BRANCAS <-

        //TORRES
        board.placePiece(new Rook(board, Color.WHITE), new Position(7, 0));
        board.placePiece(new Rook(board, Color.WHITE), new Position(7, 7));
        //CAVALOS
        board.placePiece(new Knight(board, Color.WHITE), new Position(7, 1));
        board.placePiece(new Knight(board, Color.WHITE), new Position(7, 6));
        //BISPOS
        board.placePiece(new Bishop(board, Color.WHITE), new Position(7, 2));
        board.placePiece(new Bishop(board, Color.WHITE), new Position(7, 5));
        //DAMA
        board.placePiece(new Queen(board, Color.WHITE), new Position(7, 3));
        //REI
        board.placePiece(new King(board, Color.WHITE), new Position(7 ,4));
    }
}
