package com.example.user.blackjack;

import java.util.ArrayList;
import java.util.Scanner;

import static android.support.v7.widget.AppCompatDrawableManager.get;

/**
 * Created by user on 23/06/2017.
 */

public abstract class Player {

    ArrayList<Card> cards;
    Deck deck;

    public Player() {
        cards = new ArrayList<Card>();
        deck = new Deck();

    }

    public void populateHand(Deck deck){
       cards.add(deck.getCard());
       cards.add(deck.getCard());
    }

    public void revealplayerHand(){
        System.out.println("Player hand: ");
        for(Card card : cards){
            System.out.println(card.getCard());
        }
    }

    public void populateHit(Deck deck){
         cards.add(deck.getCard());
    }

    public int getValue() {
        int count = 0;
        for (Card card : cards) {
            count += card.getNumVal();
        }
        return count;
    }

    public void revealDealerHand(){
        System.out.println(cards.get(0).getCard());
    }

}















