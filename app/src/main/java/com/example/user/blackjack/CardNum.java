package com.example.user.blackjack;

/**
 * Created by user on 23/06/2017.
 */

public enum CardNum {
    ACE(11),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    KING(10),
    QUEEN(10);

    private int numVal;


    CardNum(int numVal){
        this.numVal = numVal;
    }

    public int getNumVal(){
        return this.numVal;
    }


}
