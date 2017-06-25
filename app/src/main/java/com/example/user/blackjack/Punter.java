package com.example.user.blackjack;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 23/06/2017.
 */

public class Punter extends Player {

    ArrayList<Card> cards;
    Deck deck;
    Game game;



    private Scanner sc;

    public Punter(){
        sc = new Scanner(System.in);
        deck = new Deck();



    }

    public void NextMove() {
        System.out.println("Do you choose to hit, or stick?");
        String input = sc.nextLine().toUpperCase();
        char choice = input.charAt(0);
        if (choice != 'H') {
            System.out.println("You decide to stick");

        }



    }
}
