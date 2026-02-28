import java.util.Random;
import java.lang.Math;

class DoubleBitsToDoubleBug {
    public static void main(String[] args) {
        int i = 0x80003800;
        Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument

        // Unreachable while loop mutant
        while (false) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }

    public static void showBug() {
        long i = 0x80003800L;
        Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument

        // Unreachable while loop mutant
        while (false) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
}