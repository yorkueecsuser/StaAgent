import java.util.Random;
import java.lang.Math;

class DoubleBitsToDoubleBug {
    public static void main(String[] args) {
        int i = 0x80003800;
        Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument

        // Mutation operator: Unreachable if statement
        if (false) {
            Double.longBitsToDouble(i);
        }
    }

    public static void showBug() {
        long i = 0x80003800L;
        Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument

        // Mutation operator: Unreachable if statement
        if (false) {
            Double.longBitsToDouble(i);
        }
    }
}