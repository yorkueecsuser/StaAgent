import java.util.Random;

class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        // Unused dead store variable
        int zjmflgir = new Random().nextInt();

        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        return (e & A | B) == C; // Should be (e & (A | B)) == C
    }
}