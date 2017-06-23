package com.example.user.blackjack;

import java.util.ArrayList;

/**
 * Created by user on 23/06/2017.
 */

public class Game {
    private Punter punter;
    private Dealer dealer;
    private ArrayList<Card> card;
    private Deck deck;


    public Game() {
        this.punter = new Punter();
        this.dealer = new Dealer();
        this.deck = new Deck();
        this.card = new ArrayList<Card>();
    }

    public void playGame(){
        deck.populateDeck();
        deck.shuffleDeck();
        punter.populateHand(deck);
        dealer.populateHand(deck);
        punter.revealplayerHand();
        System.out.print("Player's hand is: ");
        System.out.println(punter.getValue());
        System.out.println("Dealer's visible card is: ");
        dealer.revealDealerHand();

    }
}
