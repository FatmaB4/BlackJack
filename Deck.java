import java.util.*;
import java.util.Collections;

//Deck class is used as the object of card piles up. Every time card taken from deck
// number of cards in the is decreased. There is also a function to check if there is 
// still cards in the deck. If not it is reshuffeled. 
public class Deck
{
	public static final int NUMFACES = 14;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS", "SPADES", "DIAMONDS", "HEARTS"};

	private int topCardIndex = 0;
	private ArrayList<Card> stackOfCards = new ArrayList<Card>();

	public Deck()
	{
		//initialize data - stackOfCards - topCardIndex
    topCardIndex = NUMCARDS - 1;
    //stackOfCards = new ArrayList<Card>();
		
    for(int s = 0; s < NUMSUITS; s++)
    {
      for(int f = 0; f < NUMFACES; f++)
      {
        stackOfCards.add(new Card(f, SUITS[s]));
      }
    }
	}

  public void shuffle()
	{
		//shuffle the deck
		//reset variables as needed
    this.resetTopCard();
    Collections.shuffle(stackOfCards);
	}

  //accessors
	public int size()
	{
		return stackOfCards.size();
	}

	public int numCardsLeft()
	{
    if (topCardIndex < 0)
      topCardIndex = 0;

		return topCardIndex;
	}

  public void resetTopCard()
  {
    topCardIndex = NUMCARDS;
  }

  public void CheckCards()
  {
    for (Card c : stackOfCards)
    {
      System.out.println(c);
    }
  }

  public Card nextCard(int i)
  {
    Card c = stackOfCards.get(i);

    return c;
  }

	public Card nextCard()
	{
    Card c = stackOfCards.get(topCardIndex--);

		return c;
	}

  public String toString()
  {
    String result = "";

    for (Card c : stackOfCards)
    {
      result += c;
    }

    return result + "\n topCardIndex = " + topCardIndex;
  }
}