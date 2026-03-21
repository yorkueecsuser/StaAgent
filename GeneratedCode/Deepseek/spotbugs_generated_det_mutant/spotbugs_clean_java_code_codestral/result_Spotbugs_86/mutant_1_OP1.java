import java.util.Random;

class BitwiseBug {
    public boolean showBug(int number) {
        // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        // Mutation: Dead Store
        int deadStoreVar = new Random().nextInt();
        if ((number & 0) == 0) {
            return true;
        } else {
            // Using deadStoreVar to avoid compiler warning
            deadStoreVar = 0;
            return false;
        }
    }
}