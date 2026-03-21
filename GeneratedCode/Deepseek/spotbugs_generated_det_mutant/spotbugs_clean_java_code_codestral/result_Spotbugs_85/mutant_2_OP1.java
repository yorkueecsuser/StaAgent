import java.util.Random;

class IncompatibleBitMasksBug {
    private static final int C = 0b1010;
    private static final int D = 0b1100;

    public boolean showBug(int e) {
        // Dead Store Mutation
        char deadStore = generateRandomChar(); // Adding a dead store variable

        // BUG: BIT: Incompatible bit masks (BIT_AND)
        return (e & C) == D;
    }

    private char generateRandomChar() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'a');
    }

    public static void main(String[] args) {
        IncompatibleBitMasksBug bug = new IncompatibleBitMasksBug();
        System.out.println(bug.showBug(0b0110)); // This will always return false
    }
}