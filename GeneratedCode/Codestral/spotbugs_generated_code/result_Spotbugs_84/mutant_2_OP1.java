import java.util.Random;

class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    public boolean showBug(int val) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        int deadStoreVariable;  // Mutant code added (Dead Store)
        deadStoreVariable = new Random().nextInt();  // Mutant code added (Dead Store)
        return ((val & CONSTANT) > 0);
    }
}