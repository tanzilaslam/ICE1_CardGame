/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;
/**
/**
 * Modifier: Tanzil Aslam
 * Student Number: 991806420
 * Date Modified: 2025-09-1
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];
        Random rand = new Random();

        System.out.println("Magic Hand Cards:");
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);       
            c.setSuit(Card.SUITS[rand.nextInt(4)]); 
            magicHand[i] = c;
            System.out.println(c.getValue() + " of " + c.getSuit());
        }

        Card luckyCard = new Card();
        luckyCard.setValue(3);
        luckyCard.setSuit("Clubs");

        System.out.println("\nLucky Card: " 
                + luckyCard.getValue() + " of " + luckyCard.getSuit());

        boolean found = false;
        for (Card c : magicHand) {
            if (c.getValue() == luckyCard.getValue() && 
                c.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("You WIN! Lucky card is in the magic hand.");
        } else {
            System.out.println("Sorry, you lose. Lucky card is NOT in the magic hand.");
        }
    }
}
