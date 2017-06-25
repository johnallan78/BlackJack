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
            System.out.println("Blackjack!");
        }

            System.out.println("Dealer's visible card is: ");
            dealer.revealDealerHand();
            punter.NextMove();
            punter.populateHit(deck);
            punter.revealplayerHand();
            System.out.println(punter.getValue());
            while (true) {
                if (punter.getValue() > 21) {
                    System.out.println("Sorry, you are bust. House wins.");
                    break;
                } else if (punter.getValue() == 21) {
                    System.out.println("Blackjack!");
                    break;
                }
                System.out.println("Do you choose to hit, or stick?");
                String input = sc.nextLine().toUpperCase();
                char choice = input.charAt(0);

                if (choice == 'S') {
                    System.out.println("You decide to stick");
                    break;
                } else
                    while ((punter.getValue() < 21)) {
                    //punter.NextMove();
                    punter.populateHit(deck);
                    punter.revealplayerHand();
                    System.out.println(punter.getValue());




            }




            break;

            }
            dealer.revealDealerHandFinal();
            System.out.println(dealer.getValue());
            while (dealer.getValue() < 17){
                dealer.populateHit(deck);
                dealer.revealDealerHandFinal();
            }

        System.out.println(dealer.getValue());
        }





}