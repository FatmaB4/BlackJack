import java.util.*;

// player participated in the game. It has cards in his/her hand and 
// wins or looses the game. Hand values and hand size of  player were kept track of 
//in the  game. if hand value is less than 16 hit is implemented automatically.

public class Player {

  private ArrayList<Card> hand;
  private int winCount;
  private int playerScore;
  private int handValue = 0;

  public Player ()
  {
    hand = new ArrayList<Card>();
  }

  public Player (int score)
  {
    playerScore = score;
  }

  public void addCardToHand( Card temp )
  {
    hand.add(temp);
    
    handValue += temp.getValue();
  }

  public void resetHand( )
  {
    hand.clear();
    handValue = 0;
  }

  public void setWinCount( int numwins )
  {
    winCount += numwins;
  }

  public int getWinCount() 
  { 
    return winCount; 
  }

  public int getHandSize() 
  { 
    return hand.size(); 
  }

  public int getHandValue()
  {
    return handValue;
  }

  public  boolean  hit( )
  {
    return false;
  }

  public String toString()
  {
    //System.out.println(" in player to string");
    String cards = "";

    for (Card c : hand)
    {
         // System.out.print("c is "+ c);
      cards += c;
    }

    return "hand = " + cards;
  }
  
}