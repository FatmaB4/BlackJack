import static java.lang.System.*;
import java.awt.Color;

// CardTestOne.java
// I implementad theplayGame method in BlackJack class and only called it from main.
//So Idont have much code here
class Main 
{
	public static void main( String args[] ) 
  {
    /******************************
     * BLACK JACK PART 1
    *******************************/
    /*
		Card one = new BlackJackCard();
		out.println(one);

		Card two = new BlackJackCard(1, "DIAMONDS");
		out.println(two);

		Card three = new BlackJackCard(4, "CLUBS");
		out.println(three);
		
		Card four = new BlackJackCard(12, "SPADES");
		out.println(four);
	
		Card five = new BlackJackCard(12, "HEARTS");
		out.println(five);	
		
		Card six = new BlackJackCard(9, "SPADES");
		out.println(six);				

    System.out.println();
		out.println(one.equals(two));
    //BELOW NEEDS TO RETURN TRUE
		out.println(one.equals(one));		
		out.println(four.equals(five));	
		out.println(three.equals(four));						

    System.out.println();
    */
    /*
    /******************************
     * BLACK JACK PART 2
    *******************************/
    /*
    Deck deck = new Deck();	

    //TESTING
    //deck.CheckCards();

    //TESTING
    //System.out.println(deck.nextCard(52));
    //System.out.println(deck.nextCard(42));
    //System.out.println(deck.nextCard(32));
    //System.out.println(deck.nextCard(25));
    //System.out.println(deck.nextCard(22));
    //System.out.println(deck.nextCard(5));
    //System.out.println(deck.nextCard(12));
    //System.out.println(deck.nextCard(2));
    
		for( int i = 0; i < Deck.NUMCARDS; i++ ) 
    {
		  out.println(deck.nextCard());
		  //out.println(i + " - " + deck.nextCard());
      //deck.decrementTopCard();
		}
		
		out.println("\n");
		
		out.println("num cards left in the deck == " + deck.numCardsLeft());
		
		out.println("\nshuffling");
		
    deck.shuffle();

		out.println("num cards left in the deck == " + deck.numCardsLeft());

    out.println("\n\ntoString");
    out.println(deck);

    */

    /******************************
     * BLACK JACK PART 3
    *******************************/
    /*
  	Player player = new Player();	
		Deck playerDeck = new Deck();
		playerDeck.shuffle();
		
		player.addCardToHand(playerDeck.nextCard());
		player.addCardToHand(playerDeck.nextCard());

		out.println("\ntoString");
		out.println(player);	
		
		out.println("\nhandValue");
		out.println(player.getHandValue());					
		
		player.addCardToHand(playerDeck.nextCard());
		player.addCardToHand(playerDeck.nextCard());

		out.println("\ntoString");
		out.println(player);	
		
		out.println("\nhandValue");
		out.println(player.getHandValue());									
    */
 
    /******************************
     * BLACK JACK PART 4
    *******************************/
		//Code to test the Dealer
	/*	Dealer dealer = new Dealer();
		Player player = new Player();
		
		dealer.shuffle();
		
		player.addCardToHand(dealer.deal());
		dealer.addCardToHand(dealer.deal());
		player.addCardToHand(dealer.deal());
		dealer.addCardToHand(dealer.deal());
		
		int playerTotal = player.getHandValue();
		int dealerTotal = dealer.getHandValue();
		
		out.println("\nPLAYER ");
		out.println("Hand Value :: " + playerTotal );
		out.println("Hand Size :: " + player.getHandSize() );
		out.println("Cards in Hand :: " + player.toString() );
    
		out.println("\nDEALER ");
		out.println("Hand Value :: " + dealerTotal );
		out.println("Hand Size :: " + dealer.getHandSize() );
		out.println("Cards in Hand :: " + dealer.toString() );
		
		if(playerTotal > 21 && dealerTotal <= 21)
		{
		  out.println("\nDealer wins - Player busted!");
		}
		else if(playerTotal  <= 21 && dealerTotal > 21)
		{
		  out.println("\nPlayer wins - Dealer busted!");
		}
		else if(playerTotal > 21 && dealerTotal > 21)
    {
		  out.println("Both players bust!");
		}
		else if(playerTotal < dealerTotal)
    {
		  out.println("\nDealer has bigger hand value!");
		}
		else
    {
		  out.println("\nPlayer has bigger hand value!");
		}					
 */
     /******************************
     * BLACK JACK PART 5
    *******************************/   
    BlackJack game = new BlackJack();
		game.playGame();

	}
}