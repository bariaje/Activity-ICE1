/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 *
 * (Modifier) Name : Jenisha Baria 
             Student Id: 991704604 
   */
import java.util.*; 


public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        // Generate random cards for magicHand
        for (int i = 0; i < magicHand.length; i++) {
            Card luckyCard = new Card();
              luckyCard.setValue(7);
              luckyCard.setSuit("Hearts");
            Card c = new Card();
            Random random = new Random();
            int randomNumber = random.nextInt(13) + 1; // Add 1 to ensure value is between 1 and 13
            c.setValue(randomNumber);
            int index = random.nextInt(4);
            String suit = Card.SUITS[index];
            c.setSuit(suit);
            magicHand[i] = c;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the card value: ");
        int cardValue = scanner.nextInt();

        System.out.print("Enter the card suit (Hearts, Clubs, Spades, Diamonds): ");
        String cardSuit = scanner.next();

        Card userCard = new Card(cardValue, cardSuit);

        boolean isCardInMagicHand = false;
        for (Card magicCard : magicHand) {
            if (magicCard.equals(userCard)) {
                isCardInMagicHand = true;
                break;
            }
        }

        if (isCardInMagicHand) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
}
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    
   


