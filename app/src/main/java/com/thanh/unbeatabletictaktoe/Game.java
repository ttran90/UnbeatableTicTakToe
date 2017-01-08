package com.thanh.unbeatabletictaktoe;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Thanh on 12/15/16.
 */
public class Game {
    private String[][] board;
    private Player player1;
    private Player player2;
    final private int boardSize = 3;
    private int playCount;
    private Player currentPlayer;
    private static Map<Integer, String> moveMap;


    public Game(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
        this.playCount = 0;
        this.board = new String[boardSize][boardSize];
        this.currentPlayer = null;
        initMoveMap();
    }

    /*
    a player turn to play
    put the position on the board
    return a boolean whether the game is over

    @params playerName: String, playerMove:String
    @return boolean gameOver
     */
    public boolean play(Player currentPlayer, int playerMove){
        String move = moveMap.get(playerMove);
        currentPlayer = currentPlayer.getName().equalsIgnoreCase(player1.getName()) ? player1: player2;
        int row, col;
        try {
            row = Integer.parseInt(Character.toString(move.charAt(0)));
            col = Integer.parseInt(Character.toString(move.charAt(1)));
            board[col][row] = currentPlayer.getName();
            currentPlayer.addMove(move);
            return (isGameOver(row, col));
        }
        //invalid move
        catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    private boolean isGameOver(int row, int col) {
        if(board[col][row].equals(board[(col + 1) % boardSize][row]) && board[col][row].equals(board[(col + 2) % boardSize][row])){
            return true;
        }
        if(board[col][row].equals(board[col][(row + 1) % boardSize]) && board[col][row].equals(board[col][(row + 2) % boardSize])) {
            return true;
        }
        if(board[col][row].equals(board[(col + 1) % boardSize][(row + 1) % boardSize]) && board[col][row].equals(board[(col + 2) % boardSize][(row + 2) % boardSize])) {
            return true;
        }
        return false;
    }

    //initialize move hash map
    private static void initMoveMap(){
        moveMap = new HashMap<Integer, String>();
        moveMap.put(1, "00");
        moveMap.put(2, "01");
        moveMap.put(3, "02");
        moveMap.put(4, "10");
        moveMap.put(5, "11");
        moveMap.put(6, "12");
        moveMap.put(7, "20");
        moveMap.put(8, "21");
        moveMap.put(9, "22");
    }


}
