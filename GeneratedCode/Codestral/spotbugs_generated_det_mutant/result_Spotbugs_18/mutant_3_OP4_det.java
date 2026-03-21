import java.util.Random;

class RandomIntegerAbsoluteValueBug {
    private Random random = new Random();

    public int showBug() {
        if (false && false && true && true && false && true && true && true && false && false && false) {long ivwqujlk = -629222220;}else{String pghjdctl = "wogbydfe";}
        int randomInt = random.nextInt(); // Generates a random signed integer

        // BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
        int absoluteValue = Math.abs(randomInt); // If randomInt is Integer.MIN_VALUE, then absoluteValue will be negative

        return absoluteValue;
    
}
}