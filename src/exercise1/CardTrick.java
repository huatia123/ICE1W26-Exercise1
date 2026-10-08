package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author Tianqi Hua Oct 07, 2026
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            
            card.setValue(1 + (int)(Math.random()*13));
            card.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            hand[i]=card;
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number 
            //between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter card value(1-13): ");
        int value = input.nextInt();
        System.out.print("Enter card suit(Hearts, Diamonds, Spades, Clubs): ");
        String suit = input.next();
        
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        boolean found = false;
        
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getValue() == value &&
                hand[i].getSuit().equalsIgnoreCase(suit)) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Card found!");
            printInfo();
        } else {
            System.out.println("Card not found.");
        }
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    // I'm done!
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Tianqi Hua, but you can call me Kevin");
        System.out.println();
        
        System.out.println("My study ambitions:");
        System.out.println("-- Be more active on Java");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Reading");
        System.out.println("-- Cooking");
        System.out.println("-- Games");
        System.out.println("-- Fishing");

        System.out.println("Those are informations about me");
		System.out.println("Thank you for playing");
        
    
    }

}
