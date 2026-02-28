import java.util.Random;
import java.lang.Math;

class DoubleBitsToDoubleBug {
    public static void main(String[] args) {
        int i = 0x80003800;
        Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    public static void showBug() {
        long i = 0x80003800L;
        Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    // unreachable if-else statement mutant
    public static void showBugMutant() {
        long i = 0x80003800L;
        if (false) {
            Double.longBitsToDouble(i);
        } else {
            // unreachable code
            System.out.println("Unreachable code");
        }
    }
}