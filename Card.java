public class Card {

  private int num;
  private int suite;
  
  public Card (int theSuite, int theNum)
  {
    suite = theSuite;
    num = theNum;
  }
  
  public int getSuite()
  {
    return suite;
  }
  
  public int getNum()
  {
    return num;
  }
  
  public String toString()
  {
    return suite + ", " + num;
  }
}
