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
import java.util.*;  
public class CardTrick {
  
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        Random rd = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rd.nextInt(13)+1);
            c.setSuit(Card.SUITS[rd.nextInt(4)]);
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the card value: ");
        int cardValue=sc.nextInt();
        System.out.println("Enter the Suit: ");
        String suit=sc.nextLine();
        Card c = new Card();
        for (int i=0; i<magicHand.length; i++)
        {
            int cv=c.getValue();
            String sS=c.getSuit();
            int count=0;
            if(cv==cardValue||sS.equals(suit))
                count++;
        }
        if(count>0)
            System.out.println("Card And Suit Found");
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
      Card luckyCard = new Card();
      luckyCard.setValue(cardValue);
      luckyCard.setSuit(suit);
    }
    
}
