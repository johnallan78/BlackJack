package com.example.user.blackjack;

/**
 * Created by user on 23/06/2017.
 */

public class Card {
    private CardNum cardNum;
    private Suit suit;

    public Card(CardNum cardNum, Suit suit) {
        this.cardNum = cardNum;
        this.suit = suit;
    }

    public int getNumVal() {
        return this.cardNum.getNumVal();
    }

    public String getCard(){
        return this.cardNum + " of " + this.suit;
    }
}
