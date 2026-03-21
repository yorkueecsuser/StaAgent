import java.util.Random;

class RandomIntegerAbsoluteValueBug {
    private Random random = new Random();

    public int showBug() {
        int vwwuxjpc = random.nextInt(); // Generates a random signed integer

        // BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
        int xhtmwaqr = Math.abs(vwwuxjpc); // If vwwuxjpc is Integer.MIN_VALUE, then xhtmwaqr will be negative

        return xhtmwaqr;
    }
}