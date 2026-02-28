import java.util.Random;

class LossyPrimitiveCompareBug {
    public int showBug() {
        // BUG: LossyPrimitiveCompare
        int unusedVariable = new Random().nextInt(); // added dead store
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }
}