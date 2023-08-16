package com.example.triovision.model;
import javafx.scene.layout.GridPane;
import javafx.scene.transform.MatrixType;

import java.util.ArrayList;
import java.util.List;

public class Board {

}


































/*
public class Board {
    private static final int BOARD_SIZE = 4;
    private Pawn[][] board;

    public Board() {
        board = new Pawn[BOARD_SIZE][BOARD_SIZE];
    }

    public void placePawn(Pawn pawn, int x, int y) {
        if (isValidMove(x, y)) {
            int currentX = pawn.getX();
            int currentY = pawn.getY();
            if (board[currentX][currentY] == pawn) {
                board[currentX][currentY] = null;
            }
            pawn.moveTo(x, y);
            board[x][y] = pawn;
        }
    }

    private boolean isValidMove(int x, int y) {
        return x >= 0 && x < BOARD_SIZE && y >= 0 && y < BOARD_SIZE;
    }

    public boolean isCardOnBoard(Card card) {
        for (int x = 0; x < BOARD_SIZE - 1; x++) {
            for (int y = 0; y < BOARD_SIZE - 1; y++) {
                if (isCardMatch(card, x, y)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isCardMatch(Card card, int x, int y) {
        for (Pawn pawn : card.getPawns()) {
            int pawnX = pawn.getX();
            int pawnY = pawn.getY();
            if (board[x + pawnX][y + pawnY] == null || !board[x + pawnX][y + pawnY].getColor().equals(pawn.getColor())) {
                return false;
            }
        }
        return true;
    }

    public void printBoard() {
        for (int x = 0; x < BOARD_SIZE; x++) {
            for (int y = 0; y < BOARD_SIZE; y++) {
                if (board[x][y] == null) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" " + board[x][y].getColor().charAt(0) + " ");
                }
            }
            System.out.println();
        }
    }
}

 */