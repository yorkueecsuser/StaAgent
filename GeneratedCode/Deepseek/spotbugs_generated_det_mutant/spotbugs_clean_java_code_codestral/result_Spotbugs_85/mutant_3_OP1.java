import java.util.Random;

class IncompatibleBitMasksBug {
    private static final int C = 0b1010;
    private static final int D = 0b1100;

    public boolean showBug(int e) {
        // BUG: BIT: Incompatible bit masks (BIT_AND)
        // Dead Store Mutation Operator
        Random rand = new Random();
        int deadStoreVariable = rand.nextInt(100); // Unused variable
        return (e & C) == D;
    }

    public static void main(String[] args) {
        IncompatibleBitMasksBug bug = new IncompatibleBitMasksBug();
        System.out.println(bug.showBug(0b0110)); // This will always return false
    }
}