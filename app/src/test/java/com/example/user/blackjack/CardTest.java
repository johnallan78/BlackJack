package com.example.user.blackjack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 23/06/2017.
 */

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(CardNum.EIGHT, Suit.CLUBS);
    }

    @Test
    public void canGetCard(){
        assertEquals("EIGHT of CLUBS", card.getCard());
    }
}
