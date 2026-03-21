import java.util.Random;
import java.lang.Math;

class DoubleBitsToDoubleBug {
    public static void main(String[] args) {
        int i = 0x80003800;
        Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    public static void showBug() {
        long i = 0x80003800L;
        int tumqupvm = 0;switch  (tumqupvm) {case 1:long bdkxvwkc = -388355641;break;default:short gkjigebx = -2696;break;}
        Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument
    
}
}