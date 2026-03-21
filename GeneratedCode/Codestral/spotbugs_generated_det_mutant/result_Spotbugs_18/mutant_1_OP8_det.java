import java.util.Random;

class RandomIntegerAbsoluteValueBug {
    private Random random = new Random();

    public int showBug() {
        int jumjwrsm = random.nextInt(); // Generates a random signed integer

        // BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
        int ypqplxeh = Math.abs(jumjwrsm); // If jumjwrsm is Integer.MIN_VALUE, then ypqplxeh will be negative

        return ypqplxeh;
    }
}