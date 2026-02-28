import java.util.Random;
import java.lang.Math;

class DoubleBitsToDoubleBug {
    public static void main(String[] args) {
        int i = 0x80003800;
        String x = "a"; // Dead Store
        Double.longBitsToDouble(i);
    }

    public static void showBug() {
        long i = 0x80003800L;
        int y = 1; // Dead Store
        Double.longBitsToDouble(i);
    }
}