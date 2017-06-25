package com.example.user.blackjack;

import java.util.ArrayList;
import java.util.Scanner;

import static android.support.v7.widget.AppCompatDrawableManager.get;

/**
 * Created by user on 23/06/2017.
 */

public abstract class Player {

    ArrayList<Card> cards;
    Player player;
    private Scanner sc;
    Dealer dealer;
    Deck deck;
    Punter punter;

    public Player() {
        cards = new ArrayList<Card>();
        sc = new Scanner(System.in);
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

    public void revealDealerHandFinal(){
        System.out.println("Dealer Hand: ");
        for(Card card : cards){
            System.out.println(card.getCard());
        }
    }

//    public void finalScores(){
//        revealDealerHandFinal();
//        System.out.println(dealer.getValue());
//        while (dealer.getValue() < 17){
//            revealDealerHandFinal();
//        }
//    }

    public void stick(){
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

    }







}















//    public String bust(){
//
//
//    }

