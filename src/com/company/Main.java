package com.company;

public class Main {

    public static void main(String[] args) {

        int size = 8;

        StringBuilder chessBoard = new StringBuilder();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size * 2; j++) {
                if ((j + i) % 2 == 0)
                    chessBoard.append(" ");
                else
                    chessBoard.append("#");
            }
            chessBoard.append("\n");
        }

        System.out.println(chessBoard);
    }
}

