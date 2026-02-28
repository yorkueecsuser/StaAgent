import java.util.Random;

class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        // Dead Store mutation
        int unusedVariable = generateRandomNumber();

        return (e & A | B) == C; // Should be (e & (A | B)) == C
    }

    // Method to generate a random number
    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}