package main.chess.pieces;

import main.boardgame.Board;
import main.chess.ChessPiece;
import main.chess.Color;

public class King extends ChessPiece {
    public King (Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
