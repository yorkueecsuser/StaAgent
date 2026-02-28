import java.util.Random;

class ByteShiftBug {
    public int showBug(byte b) {
        int unusedVar;  // Dead Store: Adding an unused variable
        Random rand = new Random();
        unusedVar = rand.nextInt(100);  // Assigning a random value to the unused variable

        int shifted = b << 24;
        return shifted;
    }
}