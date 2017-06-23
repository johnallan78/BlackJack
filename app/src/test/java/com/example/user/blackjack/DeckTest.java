package com.example.user.blackjack;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 23/06/2017.
 */

public class DeckTest {


    Card card;
    Deck deck;



    @Before

    public void before(){
        deck = new Deck();
        card = new Card(CardNum.EIGHT,Suit.CLUBS);
    }

    @Test
    public void getDeckSizeInitial(){
        assertEquals(0, deck.getDeckSize());
     }

     @Test
    public void getGameDeckSize(){
         deck.populateDeck();
         assertEquals(52, deck.getDeckSize());
     }

     @Test
    public void getDeckMinusOne(){
        deck.populateDeck();
         deck.getCard();
         assertEquals(51, deck.getDeckSize());
     }

}
