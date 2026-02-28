import java.util.Random;

class LossyPrimitiveCompareBug {
    public int showBug() {
        // BUG: LossyPrimitiveCompare
        // Mutation Operator: Dead Store
        int deadStoreVariable; // Unused variable

        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }
}