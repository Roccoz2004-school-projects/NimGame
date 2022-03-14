package com.example;

import java.util.Scanner;

public class Turns {
    public static void routine() {
        System.out.println("--Routine--");
        if (NimGameStarters.currentTurn == 0) {
            compTurn();
        } else if (NimGameStarters.currentTurn == 1) {
            playerTurn();
        }
    }

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

    public static int compTurn() {
        System.out.println("COMPUTER TURN");
        return
    }
}
