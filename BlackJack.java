import static java.lang.System.*;
import java.util.Scanner;

// This class is where we create player and dealer and manage the game.
// The class is 
public class BlackJack
{
	//add in Player instance variable
  Player player = new Player();
	//add in Dealer instance variable
  Dealer dealer = new Dealer();


	public BlackJack()
	{

	}

	public void playGame()
	{
    Scanner keyboard;
     Scanner keyboard1;
    System.out.println("in play game");
    Deck deck = new Deck();



    
    //dealer shuffles the deck of cards
    dealer.shuffle();

    char choice = 'y';

    do 
    {

      //System.out.println(Character.toString(choice));
      
      //1st –  deal the player one card
      //       dealer deals himself one cards
      //       deal the player another card
      //       dealer deals himself another cards
  // added this part
	  player.addCardToHand(dealer.deal());
		dealer.addCardToHand(dealer.deal());
		player.addCardToHand(dealer.deal());
		dealer.addCardToHand(dealer.deal());
    int playerTotal = player.getHandValue();
		int dealerTotal = dealer.getHandValue();
		

      //2nd – print out player’s hand value and cards
      this.printPlayerHand();
      //this.printDealerHand();
       // System.out.println( " now hits*****");
		// out.println("\nPLAYER ");
		// out.println("Hand Value :: " + playerTotal );
		// out.println("Hand Size :: " + player.getHandSize() );
		// out.println("Cards in Hand :: " + player.toString() );
    
		// out.println("\nDEALER ");
		// out.println("Hand Value :: " + dealerTotal );
		// out.println("Hand Size :: " + dealer.getHandSize() );
		// out.println("Cards in Hand :: " + dealer.toString() );
      

      // if (player.getHandValue() < 16)
      // {
      //   player.addCardToHand(dealer.deal());
      //   this.printPlayerHand();
      // }
      //PLAYER HIT
      //****************************************************************************
      //        while((hand value < 16 && the player wants to hit) ||
      //              ((hand value > 15 && hand value < 21) && the player wants to hit)
      //                ASK PLAYER TO HIT
      //        OR 

      //      EASIEST
      //      while(player Hand Value < 16) then hit
      //added this part
      //ask if player wants hit and apply hit
      char choice1;
if (player.getHandValue() < 21){

 this.playHit();
      keyboard1 = new Scanner(System.in);
        choice1 = keyboard1.next().charAt(0);
       // System.out.println("choice1" +choice1);

}
      while( player.getHandValue() < 21 &&  ( choice == 'Y' || choice == 'y' )) {

        //.out.println( player.getHandValue() + "Player hit*****");
	      player.addCardToHand(dealer.deal());
        if  (player.getHandValue() < 21){
           this.printPlayerHand();
        System.out.print("woulld you like another hit?");
         keyboard1 = new Scanner(System.in);
        choice1 = keyboard1.next().charAt(0);
        //System.out.println("choice1" +choice1);
        }
        
      }
      System.out.println("\nPlayer hand after hits");
        this.printPlayerHand();
       // this.printDealerHand();



      //        **WRONG LOGIC
      //        while(hand value < 16)
      //        while(hand value < 21 and the player wants to hit)
      //        **WRONG LOGIC

      //        {
      //          deal the player the next card
      //          print out player’s hand value and cards
      //        }



      //****************************************************************************

      //DEALER HIT
      //****************************************************************************
      //3rd – print out dealer’s hand value and cards
      //      while(dealer Hand Value < 16) then hit
      //      {
      //        code to add cards should be in dealer hit method	
      //        print out dealer’s hand value and cards
      //      }
      //there is no need to hit if plaer allready exceeded 21
      //added this part
if (player.getHandValue()<21) {
      while( dealer.getHandValue() < 16  ) {
	    dealer.addCardToHand(dealer.deal());
      //System.out.println( dealer.getHandValue() +   "  Dealer Hit****");
      }
     
}
 //System.out.println("\nDealer hand after dealer hits");
       this.printDealerHand();
      //****************************************************************************

      //4th – determine which player won
      this.whoWon();

      //5th – update the win total for the winner
      //Implemented in whoWon method



      //6th – dealer shuffles the deck of Cards if needed
      if (deck.size() == 0)
      {
        deck.shuffle();
      }

      //another game is to be played
      this.playAgain();
      keyboard = new Scanner(System.in);
        choice = keyboard.next().charAt(0);
        System.out.println("choice" +choice);
      dealer.shuffle();
      player.resetHand();
      dealer.resetHand();
    } while (choice == 'Y' || choice == 'y');

    String winCount = "Player won " + player.getWinCount() + " hand(s) and Dealer won " + dealer.getWinCount() + " hands.";

    System.out.println();
    System.out.println(winCount);

    keyboard.close();
	}

  private void printPlayerHand()
  {
    out.println("\nPLAYER ");
    out.println("Hand Value :: " + player.getHandValue() );
    out.println("Hand Size :: " + player.getHandSize() );
    out.println("Cards in Hand :: " + player.toString() );
  }
   private void printDealerHand()
  {
    out.println("\nDEALER ");
    out.println("Hand Value :: " + dealer.getHandValue() );
    out.println("Hand Size :: " + dealer.getHandSize() );
    out.println("Cards in Hand :: " + dealer.toString() );
  }

  public void playAgain()
  {
    System.out.print("Do you want to play again? [Y,y,N,n] :: ");
  }

    public void playHit()
  {
    System.out.print("Do you want to hit? [Y,y,N,n] :: ");
  }
  //////////////////////
	//I did not change this method, just accepted this as rule
  //I assume we were not going to implement the other rules such as split etc.
  public void whoWon()
  {
		int playerTotal = player.getHandValue();
		int dealerTotal = dealer.getHandValue();

    if (playerTotal > 21 && dealerTotal <= 21)
		{
		  out.println("\nDealer wins - Player busted!");
      dealer.setWinCount(1);
		}
		else if (playerTotal  <= 21 && dealerTotal > 21)
		{
		  out.println("\nPlayer wins - Dealer busted!");
      player.setWinCount(1);
		}    
		else if (playerTotal > 21 && dealerTotal > 21)
    {
		  out.println("Both players bust!");
		}
		else if (playerTotal < dealerTotal)
    {
		  out.println("\nDealer wins- Dealer has bigger hand value!");
       dealer.setWinCount(1);
		}
		else
    {
		  out.println("\nPlayer wins - player has bigger hand value!");
      player.setWinCount(1);
		}					
  }

	// public static void main(String[] args)
	// {
	// 	BlackJack game = new BlackJack();
	// 	game.playGame();
	// }
}