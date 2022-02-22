package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// deal the user a hand of two cards
        //Display the total of the two card values to the user
        //If the cards equal 21, declare Black Jack and congratulate the user.
        //If the cards are not equal to 21, ask the user to hit (get another card)
        // or stay (take the current score and end the “hand)
        //Allow the user to keep getting cards until their value exceeds 21, or
        // they choose to stay write
//
//        System.out.println("User hand is equal to: ");
//        Scanner userAnswer = new Scanner(System.in);
//
//        int hand =0;
//
//    if ( hand < 21){
//            System.out.println("Get another card or take current score?");
//            String response= userAnswer.nextLine();
//        }if (userAnswer.equals ("card"));{
//            Random hit;
        Deck newDeck = new Deck();
        newDeck.buildDeck();
        }
    }
