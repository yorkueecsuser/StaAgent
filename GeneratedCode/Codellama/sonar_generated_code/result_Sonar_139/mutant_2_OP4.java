import java.util.Random;
import java.lang.Math;

class DoubleBitsToDoubleBug {
    public static void main(String[] args) {
        int i = 0x80003800;
        Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // do nothing
        } else {
            Double.longBitsToDouble(i);
        }
    }

    public static void showBug() {
        long i = 0x80003800L;
        Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // do nothing
        } else {
            Double.longBitsToDouble(i);
        }
    }
}