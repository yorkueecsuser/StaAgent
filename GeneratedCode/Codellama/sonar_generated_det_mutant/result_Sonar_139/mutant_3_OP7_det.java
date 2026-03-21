import java.util.Random;
import java.lang.Math;

class DoubleBitsToDoubleBug {
    public static void main(String[] args) {
        int i = 0x80003800;
        Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    public static void showBug() {
        long i = 0x80003800L;
        boolean abpxtcme = false;while (abpxtcme && true && true && true && false && true && false && false && true && true && false && false) {long mizdfnwd = 940951553;}
        Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument
    
}
}