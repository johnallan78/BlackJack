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
        System.out.println("Do you choose to hit, or stick?");
        String input = sc.nextLine().toUpperCase();
        char firstChoice = input.charAt(0);

           if (firstChoice == 'H') {
               punter.populateHit(deck);
               punter.revealplayerHand();
               punter.getValue();
           }
           else if (firstChoice == 'S') {
               punter.getValue();
               System.out.println("You decide to stick");
               System.out.println("Dealer's hand: ");
               System.out.println(dealer.getValue());
               while(dealer.getValue() < 17){
                   dealer.populateHand(deck);
                   dealer.getValue();
                   System.out.println(dealer.getValue());
               }
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

        while(true) {
            System.out.println("Do you choose to hit, or stick?");
            String secondInput = sc.nextLine().toUpperCase();
            char secondChoice = secondInput.charAt(0);
            if (secondChoice == 'H') {
                if (punter.getValue() < 21) {
                    punter.populateHit(deck);
                    punter.revealplayerHand();
                    System.out.println("Player's hand is: ");
                    System.out.println(punter.getValue());
                    break;
                }
            }
            else if (secondChoice == 'S') {
                System.out.println("You decide to stick");
                break;

             }
             break;
        }




        System.out.println("Dealer's hand: ");
        System.out.println(dealer.getValue());
        while(dealer.getValue() < 17){
            dealer.populateHit(deck);
            dealer.getValue();
            System.out.println(dealer.getValue());
        }
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