import java.util.Arrays;

class IncompatibleArrayCompareBug {
    public static void main(String[] args) {
        String[] strArr1 = {"hello", "world"};
        StringBuffer[] strBufArr2 = {new StringBuffer("hello"), new StringBuffer("world")};
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println(strArr1.equals(strBufArr2)); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
        } else {
            // unreachable code
            System.out.println("This code is unreachable");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}