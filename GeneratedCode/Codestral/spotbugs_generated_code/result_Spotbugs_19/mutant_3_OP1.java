import java.util.Random;

class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        int unusedVariable; // Dead Store mutation
        Random rand = new Random();
        unusedVariable = rand.nextInt(100); // Initialize with a random value
        return absoluteValue;
    }
}