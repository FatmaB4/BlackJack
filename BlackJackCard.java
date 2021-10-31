public class BlackJackCard extends Card
{    
  //constructors
  public BlackJackCard()
  {

  }

  public BlackJackCard(int i, String s)
  {
    super.setFace(i);
    super.setSuit(s);
  }

  public int getValue()
  {   
    //override the Card getValue to build BlackJack logic
    //enables you to build the value for the game into the card
    //this makes writing the whole program a little easier
    
    return super.getValue();
  }
 }