import java.util.*;

class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        // BUG: ComparisonOutOfRange
        // Mutant code: Dead Store
        int deadStoreVariable = new Random().nextInt();
        return value == 200;
    }
}