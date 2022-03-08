package com.example;

import java.util.*;

public class NimGameStarters {
    public static int makeMarkers() {
        return ((int) (Math.random() * 25 + 20));
    }
    public static int numMarkers = makeMarkers(); //Creates random amount of markers
    public static int currentTurn = 0;

    public static boolean queryFirstMove(int num) {
        boolean firstMove = false;
        if (num % 4 != 1) {
            firstMove = true;
        }
        return firstMove;
    } //Tests whether the Computer or Player should go first (as boolean)

    public static String userNamePrompt() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type in your name. ");
        String playerName = input.nextLine();
        System.out.println("Welcome to the game of Nim, " + playerName);
        System.out.println();
        return playerName;
    } //Gets Player's name from input, and outputs a welcome msg.

    public static void main(String[] args) {
        String player = userNamePrompt();

        System.out.println("This game will be played with " + numMarkers + " markers.");
        starter();
    }

    public static int broadcastMarkers() {
        numMarkers = numMarkers - 1;
        return numMarkers;
    }

    public static void starter() {
        System.out.println(currentTurn);
        if (queryFirstMove(numMarkers) == true) {
            System.out.println("-- Comp. Move --"); //Delete later
            currentTurn = 0;
        } else {
            System.out.println("-- Player Move --"); //Delete later
            currentTurn = 1;
            playerTurn();
        }
    } //Sends first move to either Computer or Player based on query, then sends next move to routine

    public static int playerTurn() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please take 1, 2, or 3 markers. ");
        int playerTake = Integer.parseInt(input.nextLine());
        if ((playerTake == 1)||(playerTake == 2)||(playerTake == 3)) {
            System.out.println("You picked " + playerTake + " markers.");
        } else {
            System.out.println("Please take ONLY 1, 2, or 3 markers!");
            playerTurn();
        }
        return playerTake;
    }

    public static void endGame() {
        if (numMarkers == 1) {
            System.out.println("Game Over!");
            if (currentTurn == 0) {
                System.out.println("The Computer wins!");
            }
        }
    }
}