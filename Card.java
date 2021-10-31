
// this class is used as card dec object wehere all the cards were received.
//the deck is shuffeled / reset in every game. here i did not understand what zero is but // I did not change it. I also did not take in to account wehere ace is counted as 1 or 11
public class Card
{

	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			                                  "FIVE","SIX","SEVEN","EIGHT","NINE",
                                        "TEN","JACK","QUEEN","KING"};

	private String suit;
	private int face;
  private int count = 0;

  //constructors
  public Card()
  {

  }

  public Card(int f, String s)
  {
    suit = s;
    face = f;
  }
    
  public String getSuit()
  {
    return suit;
  }

  public void setSuit(String s)
  {
    suit = s;
  }
  
  public int getFace()
  {
    return face;
  }

  public void setFace(int f)
  {
    face = f;
  }

  public String getFaces(int i)
  {
    return FACES[i];
  }

  public int getValue()
  {
    int cardValue = 0;
    
    if (face == 1)
      cardValue = 11;
    else if (face >= 10)
      cardValue = 10;
    else
      cardValue = face;

    return cardValue;
  }

	public boolean equals(Object obj)
	{
		return this == obj;
	}

  public String toString()
  {
    return "\n" + this.FACES[face] + " of " + this.getSuit() + " | value = " + this.getValue();
  }
      	
}