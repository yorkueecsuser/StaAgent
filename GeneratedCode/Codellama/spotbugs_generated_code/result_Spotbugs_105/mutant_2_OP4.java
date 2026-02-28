import java.util.Arrays;

class IncompatibleArrayCompareBug {
    public static void main(String[] args) {
        String[] strArr1 = {"hello", "world"};
        StringBuffer[] strBufArr2 = {new StringBuffer("hello"), new StringBuffer("world")};
        if (true) {
            System.out.println(strArr1.equals(strBufArr2)); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
        } else {
            System.out.println("The unreachable code");
        }
    }
}