import java.util.Random;
import java.lang.Math;

class DoubleBitsToDoubleBug {
    public static void main(String[] args) {
        int i = 0x80003800;
        Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument
        if(false) {
            // unreachable code
            System.out.println("This is unreachable code");
        } else {
            // reachable code
            System.out.println("This is reachable code");
        }
    }

    public static void showBug() {
        long i = 0x80003800L;
        Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument
        if(false) {
            // unreachable code
            System.out.println("This is unreachable code");
        } else {
            // reachable code
            System.out.println("This is reachable code");
        }
    }
}