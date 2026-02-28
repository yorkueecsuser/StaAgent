import java.util.Arrays;

class IncompatibleArrayCompareBug {
    public static void main(String[] args) {
        String[] strArr1 = {"hello", "world"};
        StringBuffer[] strBufArr2 = {new StringBuffer("hello"), new StringBuffer("world")};
        System.out.println(strArr1.equals(strBufArr2)); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)

        // Mutant 1: Add an unreachable while loop
        boolean condition = getCondition();
        while (condition) {
            // This loop is unreachable because the condition is always false
            System.out.println("This code is unreachable");
        }
    }

    // Helper method to generate a boolean value
    private static boolean getCondition() {
        return false;
    }
}