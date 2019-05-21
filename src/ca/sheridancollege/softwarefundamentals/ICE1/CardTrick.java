/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {

    import java.util.Scanner;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()13+1));//c.setValue(insert call to random number generator here)
            c.setSuit(Card.SUITS[Math.random()*3];//c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        int cardSearch;
        String suitSearch;

System.out.println("Please enter a Card value");
cardSearch = input.nextint();

 System.out.println("Please enter a Card Suit");
 suitSearch = input.nextLine();

 for (int i =0; i < magiceHand.length;i++){
     if (magicHand[i].getValue == cardSearch && magicHand[i].getSuit == suitSearch) {
         System.out.println("FOUND YOUR LUCKY NUMBER");
     }
 }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}