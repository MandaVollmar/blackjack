package com.company;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.List;

public class Deck {
        //Deck should have a public method that “builds” an arraylist of Card objects
        //Assign each Card a Suit (Spades, Clubs, Diamond, and Heart)
        //Assigning each card a Rank (2-10, Jack, Queen, King, Ace)
        //Assigning each card a value to 2-11
        //This should be done to recreate the 52 unique cards in a deck
        private ArrayList<Card> deck= new ArrayList<>();
        public void buildDeck() {

        List<String> suit = new ArrayList<>();
        List<String> rank = new ArrayList<>();
        List<Integer> value = new ArrayList<>();

        suit.add("Spades");
        suit.add("Clubs");
        suit.add("Diamonds");
        suit.add("Hearts");

        rank.add("2");
        rank.add("3");
        rank.add("4");
        rank.add("5");
        rank.add("6");
        rank.add("7");
        rank.add("8");
        rank.add("9");
        rank.add("10");
        rank.add("Jack");
        rank.add("Queen");
        rank.add("King");
        rank.add("Ace");

        value.add(2);
        value.add(3);
        value.add(4);
        value.add(5);
        value.add(6);
        value.add(7);
        value.add(8);
        value.add(9);
        value.add(10);
        value.add(10);
        value.add(10);
        value.add(10);
        value.add(11);

        for (int s=0; s< suit.size();s++){
            for (int r=0; r< rank.size(); r++){
                Card card = new Card(suit.get(s), rank.get(r), value.get(r));
                deck.add(card);
                System.out.println(card.getRank() +" of "+ card.getSuit() +" is equal to "+ card.getValue());
            }
        }




    }

    }
