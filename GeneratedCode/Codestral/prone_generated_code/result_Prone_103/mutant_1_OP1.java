import java.util.*;

class LossyPrimitiveCompareBug {
    public int showBug() {
        // BUG: LossyPrimitiveCompare
        int deadStoreVariable = new Random().nextInt();  // Dead Store Mutant
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }
}