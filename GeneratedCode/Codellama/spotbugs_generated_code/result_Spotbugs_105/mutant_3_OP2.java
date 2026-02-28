import java.util.Arrays;

class IncompatibleArrayCompareBug {
    public static void main(String[] args) {
        String[] strArr1 = {"hello", "world"};
        StringBuffer[] strBufArr2 = {new StringBuffer("hello"), new StringBuffer("world")};
        System.out.println(strArr1.equals(strBufArr2)); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)

        // Mutant 1: Duplicate assignment statement (String[] strArr1 = {"hello", "world"};)
        String[] strArr1_mutant1 = {"hello", "world"};
        System.out.println(strArr1_mutant1.equals(strBufArr2));

        // Mutant 2: Duplicate assignment statement (StringBuffer[] strBufArr2 = {new StringBuffer("hello"), new StringBuffer("world")};)
        StringBuffer[] strBufArr2_mutant2 = {new StringBuffer("hello"), new StringBuffer("world")};
        System.out.println(strArr1.equals(strBufArr2_mutant2));
    }
}