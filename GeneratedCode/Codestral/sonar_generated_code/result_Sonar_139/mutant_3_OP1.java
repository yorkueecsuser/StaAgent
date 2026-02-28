import java.util.Random;

class DoubleBug {
    public double showBug(int value) {
        // BUG: "Double.longBitsToDouble" should take "long" as argument
        int unusedVar; // Dead store - Unused variable declaration

        Random rand = new Random();
        unusedVar = rand.nextInt(); // Assigning a random value to the unused variable

        return Double.longBitsToDouble(value); // Noncompliant - May lead to incorrect value due to interpretation of most significant bit
    }
}