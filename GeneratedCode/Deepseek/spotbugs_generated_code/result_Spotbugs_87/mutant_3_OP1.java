import java.util.Random;

class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        // Mutation Operator: Dead Store
        // Mutant Code: Adding an unused variable declaration

        Random rand = new Random();
        int deadStore = rand.nextInt(); // Unused variable

        return (e & A | B) == C; // Original buggy code
    }
}