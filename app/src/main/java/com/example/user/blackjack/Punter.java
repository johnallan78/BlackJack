package com.example.user.blackjack;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 23/06/2017.
 */

public class Punter extends Player {

    ArrayList<Card> cards;
    Deck deck;
    Punter punter;
    Player player;



    private Scanner sc;

    public Punter(){
        sc = new Scanner(System.in);
        deck = new Deck();
        player = new Player();


    }

    public void NextMove() {
        System.out.println("Do you choose to hit, or stick?");
        String input = sc.nextLine().toUpperCase();
        char choice = input.charAt(0);
        while (choice == 'H'){
            System.out.println("The dealer will give you another card.");
            player.populateHit(deck);
        }

    }






}
