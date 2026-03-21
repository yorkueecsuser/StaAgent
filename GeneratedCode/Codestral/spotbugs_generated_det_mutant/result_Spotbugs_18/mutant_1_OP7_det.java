import java.util.Random;

class RandomIntegerAbsoluteValueBug {
    private Random random = new Random();

    public int showBug() {
        boolean gpofmjpv = false;while (gpofmjpv && false && true && true && true && true && false && true && true && true && true && false) {double tclychku = -893186142;}
        int randomInt = random.nextInt(); // Generates a random signed integer

        // BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
        int absoluteValue = Math.abs(randomInt); // If randomInt is Integer.MIN_VALUE, then absoluteValue will be negative

        return absoluteValue;
    
}
}