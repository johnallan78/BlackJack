package com.example.user.blackjack;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 23/06/2017.
 */

public class Game {
    private Punter punter;
    private Dealer dealer;
    private ArrayList<Card> card;
    private Deck deck;
    private Scanner sc;


    public Game() {
        this.punter = new Punter();
        this.dealer = new Dealer();
        this.deck = new Deck();
        this.card = new ArrayList<Card>();
        sc = new Scanner(System.in);
    }




    public void playGame() {
        deck.populateDeck();
        deck.shuffleDeck();
        punter.populateHand(deck);
        dealer.populateHand(deck);
        punter.revealplayerHand();
        System.out.print("Player's hand is: ");
        System.out.println(punter.getValue());
            if (punter.getValue() == 21){
            System.out.println("Blackjack!- Player Wins!");
                return;
        }

            System.out.println("Dealer's visible card is: ");
            dealer.revealDealerHand();
//            punter.NextMove();
        System.out.println("Do you choose to hit, or stick?");
        String input = sc.nextLine().toUpperCase();
        char firstChoice = input.charAt(0);

           if (firstChoice == 'H') {
               punter.populateHit(deck);
               punter.revealplayerHand();
           }
           else if (firstChoice == 'S') {
               System.out.println("You decide to stick");
               System.out.println("Dealer's hand: ");
               System.out.println(dealer.getValue());
               if (dealer.getValue() > 21) {
                   System.out.println("House is bust. Player wins.");
               } else if (punter.getValue() > 21) {
                   System.out.println("Player Bust! House Wins.");
               } else if (dealer.getValue() < punter.getValue()) {
                   System.out.println("Player Wins!");
               } else if (dealer.getValue() > punter.getValue()) {
                   System.out.println("House Wins");
               } else if (dealer.getValue() == punter.getValue()) {
                   System.out.println("Draw. Player wins!");
               }
               return;
           }

           punter.getValue();
           if (punter.getValue() > 21) {
               System.out.println(punter.getValue());
               System.out.println("Sorry, you are bust. House wins.");
               return;
           } else if (punter.getValue() == 21) {
               System.out.println("Blackjack!- Player Wins!");
               return;
           }
           System.out.println(punter.getValue());
           System.out.println("Do you choose to hit, or stick?");


//            if (firstChoice == 'H') {
//                while ((punter.getValue() < 21)) {
//                    punter.populateHit(deck);
//                    punter.revealplayerHand();
//                    System.out.println(punter.getValue());
//                }
//            }
//
//            else if (firstChoice == 'S') {
//                    System.out.println("You decide to stick");
//
//
//                }



        System.out.println("Dealer's hand: ");
        System.out.println(dealer.getValue());
        if (dealer.getValue() > 21) {
            System.out.println("House is bust. Player wins.");
        }
        else if (punter.getValue() > 21 ){
            System.out.println("Player Bust! House Wins.");
        }
        else if (dealer.getValue() < punter.getValue()){
            System.out.println("Player Wins!");
        }
        else if (dealer.getValue() > punter.getValue()){
            System.out.println("House Wins");
        }
        else if (dealer.getValue() == punter.getValue()){
            System.out.println("Draw. Player wins!");
        }

    }





}