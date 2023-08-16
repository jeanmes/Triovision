package com.example.triovision.model;


import java.util.Arrays;

public class Card {
    private int[][] matrix;

   public Card(int a, int b, int c, int d) {
       this.matrix = new int[][]{{0,a,0},{0,b,0},{c,0,d}};
   }

    public Card(int[][] m) {
        this.matrix = m;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    @Override
    public boolean equals(Object o) {
        Card card2 = (Card) o;
        int[][] matrix2 = card2.getMatrix();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] != matrix2[i][j]) {
                    return false;
                }

            }

        }
        return true;
    }
}
