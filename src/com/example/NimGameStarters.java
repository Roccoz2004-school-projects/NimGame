package com.example;

import java.util.*;

public class NimGameStarters {
    public static int makeMarkers() {
        return ((int) (Math.random() * 25 + 20));
    }
    public static int numMarkers = makeMarkers();

    public static boolean computerMoveFirst(int num) {
        boolean firstMove = false;
        if (num % 4 != 1) {
            firstMove = true;

        } else {

        }
        return firstMove;
    }

    public static String userNamePrompt() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type in your name. ");
        String playerName = input.nextLine();
        System.out.println("Welcome to the game of Nim, " + playerName);
        System.out.println();
        return playerName;
    }

    public static void main(String[] args) {
        String player = userNamePrompt();

        System.out.println("This game will be played with " + numMarkers + " markers.");
        System.out.println(computerMoveFirst(numMarkers));
        starterMove();
    }

    public static int broadcastMarkers() {
        numMarkers = numMarkers - 1;
        return numMarkers;
    }
    public static void starterMove() {
        if (computerMoveFirst(numMarkers) == true) {
            System.out.println("Comp. Move");

        } else {
            System.out.println("Player Move");
        }

    }
}