package com.company;

public class Card {
    //A card should have at least 3 properties: suit, rank, and value

    private String suit;
    private String rank;
    private int value;


    public String getSuit () {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }

    public Card(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

}
