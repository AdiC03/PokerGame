import java.util.Random;

public class Randomizer {
// This is a wrapper class for the Random class.

    private Random random_ = null;
   
    public Randomizer() {
        random_ = new Random();        
    }

    // Randomly returns true or false.
    public boolean nextBoolean() {
        return random_.nextBoolean();
    }

    // Returns true if the double parameter 0.0..1.0 is
    // below a random probability otherwise returns false.
    public boolean nextBoolean(double probability) {
        return random_.nextDouble() < probability;
    }
   
    // Randomly returns a number between 0 and 2^32.
    public int nextInt() {
        return random_.nextInt();
    }

    // Randomly returns a number between 0 and n.
    public int nextInt(int n) {
        return random_.nextInt(n);
    }

    // Randomly returns an integer between min and max.
    public int nextInt(int min, int max) {
        return min + random_.nextInt(max - min + 1);
    }

    // Randomly returns a double between 0 and 1.0
    public double nextDouble() {
        return random_.nextDouble();
    }

    // Randomly returns a double between min and max.
    public double nextDouble(double min, double max)    {
        return min + (max - min) * random_.nextDouble();
    }    
}
