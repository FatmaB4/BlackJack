import java.util.Collections;

//dealer class is thesecond Player. it manages the play and and deck
public class Dealer extends Player
{
	//define a deck of cards
  Deck deck = new Deck();	

	public Dealer() 
  {
	}

	public void shuffle()
	{
    //shuffle the deck
    deck.shuffle();
	}

	public Card deal()
  {
    return deck.nextCard();
	}
	
	public int numCardsLeftInDeck()
	{
		return deck.numCardsLeft();
	}

	public boolean hit()
	{
    //LOGIC
	  return super.hit();
  }
}