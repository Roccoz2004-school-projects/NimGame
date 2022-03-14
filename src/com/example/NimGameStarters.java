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
            Turns.routine();
        } else {
            System.out.println("-- Player Move --"); //Delete later
            currentTurn = 1;
            Turns.routine();
        }
    } //Sets first move to either Computer or Player based on query, then sends next move to routine



    public static void endGame() {
        if (numMarkers == 1) {
            System.out.println("Game Over!");
            if (currentTurn == 0) {
                System.out.println("The Computer wins!");
            }
        }
    }
}