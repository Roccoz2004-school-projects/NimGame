package com.example;

import java.util.*;

public class NimGameStarters {
    public static int makeMarkers() {
        return ((int) (Math.random() * 25 + 20));
    }
    public static int numMarkers = makeMarkers(); //Creates random amount of markers
    public static int currentTurn = 0; //Initialize turn counter
    public static String playerName = ""; //Initialize player's name

    public static boolean queryFirstMove(int num) {
        boolean firstMove = false;
        if (num % 4 != 1) {
            firstMove = true;
        }
        return firstMove;
    } //Tests whether the Computer or Player should go first (as boolean)

    public static String userNamePrompt() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type in your name... ");
        playerName = input.nextLine();
        System.out.println("Welcome to the game of Nim, " + playerName + "!\n");
        return playerName;
    } //Gets Player's name from input, and outputs a welcome msg.

    public static void main(String[] args) {
        String player = userNamePrompt();
        System.out.println("This game will be played with " + numMarkers + " markers.\n");
        starter();
    }

    public static void starter() {
        if (queryFirstMove(numMarkers) == true) {
            currentTurn = 0;
            Turns.routine();
        } else {
            currentTurn = 1;
            Turns.routine();
        }
    } //Sets first move to either Computer or Player based on query, then sends next move to routine
}