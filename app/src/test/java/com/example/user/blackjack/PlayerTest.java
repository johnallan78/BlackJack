package com.example.user.blackjack;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 23/06/2017.
 */

public class PlayerTest {

    Punter punter;
    ArrayList<Card> cards;
    Deck deck;

    @Before
    public void before() {
        punter = new Punter();
        deck = new Deck();



    }

//    @Test
//    public void canRevealPunterHand(){
//        punter.populateHand();
//        assertEquals(punter.revealHand());
//    }


}