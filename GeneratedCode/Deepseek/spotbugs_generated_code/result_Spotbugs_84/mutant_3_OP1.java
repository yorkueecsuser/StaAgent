import java.util.Random;

class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    public boolean showBug(int val) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        // Mutation Operator: Dead Store
        char unUsedVar = generateRandomChar();
        return ((val & CONSTANT) > 0);
    }

    private char generateRandomChar() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'a');
    }
}