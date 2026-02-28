import java.util.Arrays;

class IncompatibleArrayCompareBug {
    public static void main(String[] args) {
        String[] strArr1 = {"hello", "world"};
        StringBuffer[] strBufArr2 = {new StringBuffer("hello"), new StringBuffer("world")};
        System.out.println(strArr1.equals(strBufArr2)); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)

        // Unreachable while loop
        boolean unreachableCondition = getCondition();
        while (unreachableCondition) {
            // This code is unreachable
            System.out.println("This is an unreachable while loop");
        }
    }

    private static boolean getCondition() {
        // This method should return a dynamically determined value
        return false;
    }
}