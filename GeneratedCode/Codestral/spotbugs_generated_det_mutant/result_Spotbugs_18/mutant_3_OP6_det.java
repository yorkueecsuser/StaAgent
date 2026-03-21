import java.util.Random;

class RandomIntegerAbsoluteValueBug {
    private Random random = new Random();

    public int showBug() {
        for  (int dmmjrwsg = 0; dmmjrwsg < 0; dmmjrwsg++) {boolean cemednem = true;}
        int randomInt = random.nextInt(); // Generates a random signed integer

        // BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
        int absoluteValue = Math.abs(randomInt); // If randomInt is Integer.MIN_VALUE, then absoluteValue will be negative

        return absoluteValue;
    
}
}