import java.util.Random;
import java.lang.Math;

class DoubleBitsToDoubleBug {
    public static void main(String[] args) {
        int z = 0x80003800;
        Double.longBitsToDouble(z);   // BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    public static void showBug() {
        long j = 0x80003800L;
        Double.longBitsToDouble(j);   // BUG: "Double.longBitsToDouble" should take "long" as argument
    }
}