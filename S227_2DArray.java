public class S227_2DArray implements Runnable {

Randomizer randomizer;
   
    private class Poker {
       
    int [][] cards = {
   {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, // Spades is 0
   {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, // Hearts is 1
   {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, // Clubs is 2
   {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, // Diamonds is 3
    };
   
       
        public Poker(Randomizer random) {
            randomizer = random;
        }
       
        public int numOfRounds()
        {
       int maxRounds = 5;
       return randomizer.nextInt(maxRounds);
        }
       
       
        public Card giveRandomCard()
        {
        Card card;
        int typeOfCard = randomizer.nextInt(4);
        int cardNum = randomizer.nextInt(10);
       
        if (cards [typeOfCard][cardNum] != -1)
        {
        card = new Card(typeOfCard, cardNum);
        cards [typeOfCard][cardNum] = -1;
        return card;
        }
       
           return giveRandomCard();
       
        }
       
       
        // TODO Create at least two different public methods that
        // TODO calls randomizer object and returns a value.
    }
   
    private class Player {
   
    private String name;
    private int playerNum;
    private Card [] hand = new Card [4];
   
    public Player(String theName, int thePlayerNum)
    {
    name = theName;
    playerNum = thePlayerNum;
   
    }
   
    public int getPlayerNum()
    {
    return playerNum;
    }
   
    public Card [] getHand()
    {
    return hand;
    }
   
    public void setCard(Card newCard)
    {
    for(int i=0; i < hand.length; i++)
    {
    if (hand[i] == null)
    {
    hand[i] = newCard;
    break;
    }
    }
   
    }
   
    // Change Count to int
    public int GetGreatestCard()
    {
    int [] buffer = new int [10];
    int numCard = 0;
    int cardValue = 0;
    // Getting number of duplicates
    for(int i=0; i< hand.length; i++)
    {
    buffer[hand[i].getNum()]++;

    }
   
    for (int i = 0; i < buffer.length; i++)
    {
    if (buffer[i] > numCard)
    {
    cardValue = i;
    numCard = buffer[i];
    }
    }
   
    System.out.println();
    System.out.println(numCard);
    System.out.println(cardValue);
   
    return numCard;
    }
   
    public int numInSuite()
    {
    int [] buffer2 = new int [4];
    int suite = 0;
    int numOfSuite = 0;
    // Getting number of duplicates
    for(int i=0; i< hand.length; i++)
    {
    buffer2[hand[i].getSuite()]++;

    }
   
    for (int i = 0; i < buffer2.length; i++)
    {
    if (buffer2[i] > numOfSuite)
    {
    suite = i;
    numOfSuite = buffer2[i];
    }
    }
   
    System.out.println();
    System.out.println(numOfSuite);
    System.out.println(suite);
    return numOfSuite;
    }
   
        // TODO Declare the game object.
        //
        // TODO Create a constructor that initializes the game object.
        //
        // TODO Create at least two different public methods that calls
        // TODO the game object and returns a value.
   
    }
    // TODO Declare the game object.
    // TODO Declare player one
    // TODO Declare player two
   
    public void run() { //this is essentially the client class
        // TODO Allocate memory for the game object
        //
        // TODO Allocate memory for player one and pass in the game object
        // TODO in the constructor.
        //
        // TODO Allocate memory for player one and pass in the game object
        // TODO in the constructor.
        //
        // TODO Call player methods to play the game.
        // TODO Print out the winner.
   
    Randomizer rand = new Randomizer();
    Poker poker = new Poker(rand);
    // Change these later
    for (int r = 1; r <= poker.numOfRounds(); r++)
    {
   
    Player mario = new Player("Mario", 1);
    Player luigi = new Player("Luigi", 2);
   
   
   
    for (int i = 0; i < mario.getHand().length; i++)
    {
    mario.setCard(poker.giveRandomCard());
        luigi.setCard(poker.giveRandomCard());
    }
   
    for (int i = 0; i < mario.getHand().length; i++)
    {
    System.out.println(mario.getHand()[i]);
    }
   
    System.out.println();
   
    for (int i = 0; i < mario.getHand().length; i++)
    {
    System.out.println(luigi.getHand()[i]);
    }
   
    System.out.println();
   
    for (int i = 0; i < poker.cards.length; i++)
    {
    for (int j = 0; j < poker.cards[i].length; j++)
    {
    System.out.print(poker.cards[i][j] + " ");
    }
    System.out.println();
    }
   
   
    int marioCount = mario.GetGreatestCard();
    int luigiCount = luigi.GetGreatestCard();
   
    if (marioCount > luigiCount)
    {
    System.out.println("Mario wins!");
    }
   
    else if (marioCount < luigiCount)
    {
    System.out.println("Luigi wins!");
    }
   
    else
    {
    int numMarioSuite = mario.numInSuite();
        int numLuigiSuite = luigi.numInSuite();
       
    if (numMarioSuite > numLuigiSuite)
    {
    System.out.println("Mario Wins.");
    }
   
    else if (numMarioSuite < numLuigiSuite)
    {
    System.out.println("Luigi Wins.");
    }
   
    else
    {
    System.out.println("It's a tie.");
    }
    }
    }
   
    }

  }
