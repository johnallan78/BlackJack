package com.example.user.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by user on 23/06/2017.
 */

public class Deck {
    private ArrayList<Card> cards;
    private Card card;

    public Deck(){
        this.cards = new ArrayList<Card>();
    }

//    public Card addCard(){
//       this.deck.add(card);
//    }

    public void populateDeck(){
        for (CardNum cardNum : CardNum.values()){
            for (Suit suit : Suit.values()){
                cards.add(new Card(cardNum, suit));
            }
        }
    }

    public int getDeckSize(){
        return this.cards.size();
    }

    public void shuffleDeck(){
        Collections.shuffle(cards);
    }

    public Card getCard(){
        return cards.remove(0);
    }
}
