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

    // Unreachable for loop mutant
    public static void unreachableForLoop() {
        for (int i = 0; false; i++) {
            // Code that is never executed
            System.out.println("This code is never reached.");
        }
    }
}