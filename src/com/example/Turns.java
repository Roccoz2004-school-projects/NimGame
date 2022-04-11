package com.example;

import java.util.Scanner;

public class Turns {

    public static NimGameStarters Nim = new NimGameStarters();
    static int markers = Nim.numMarkers;

    public static void routine() {
        if (Nim.currentTurn == 0) {
            markers = (markers - compTurn());
            Nim.currentTurn = 1;
        } else if (Nim.currentTurn == 1) {
            markers = (markers - playerTurn());
            Nim.currentTurn = 0;
        }
        System.out.println("There are " + markers + " markers left.\n");
        queryEndGame();
        routine();
    }

    /*
        Player enters # of markers to take (1, 2, or 3)
        Check for valid input
        If input is NOT valid: show error, repeat prompt
            Else (input is valid): return # of markers taken
    */
    public static int playerTurn() {
        System.out.println(Nim.playerName + "'s Turn:");
        Scanner input = new Scanner(System.in);
        System.out.print("Please take 1, 2, or 3 markers... ");
        int playerTake = Integer.parseInt(input.nextLine()); //Ask for player input
        if ((playerTake == 1)||(playerTake == 2)||(playerTake == 3)) {
            System.out.println("You picked " + playerTake + " markers.");
        } else {
            System.out.println("Please take ONLY 1, 2, or 3 markers!"); //If take is not valid, show error
            playerTurn();
        }
        return playerTake;
    }

    public static int compTurn() {
        int num = 0;
        System.out.println("Computer's Turn:");
        if ((markers - 1) % 3 == 0) {
            num = 1;
        } else if ((markers - 2) % 3 == 0) {
            num = 2;
        } else if ((markers - 3) % 3 == 0) {
            num = 3;
        }
        System.out.println("Computer picked " + num + " markers.");
        return num;
    }

    public static void queryEndGame() {
        if (markers == 0) {
            System.out.println("Game Over!");
            if (Nim.currentTurn == 0) {
                System.out.println("The Computer wins!");
            } else if (Nim.currentTurn == 1) {
                System.out.println("The Player wins!");
            }
            System.exit(0);
        }
    }
}
