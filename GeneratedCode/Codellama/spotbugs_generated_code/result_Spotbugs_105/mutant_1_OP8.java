import java.util.Arrays;

class IncompatibleArrayCompareBug {
    public static void main(String[] args) {
        String[] strArr1 = {"hello", "world"};
        StringBuffer[] strBufArr2 = {new StringBuffer("hello"), new StringBuffer("world")};
        System.out.println(strArr1.equals(strBufArr2)); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    }

    // Mutant code: Renaming the variable "strArr1" to "arr1"
    public static void main(String[] args) {
        String[] arr1 = {"hello", "world"};
        StringBuffer[] strBufArr2 = {new StringBuffer("hello"), new StringBuffer("world")};
        System.out.println(arr1.equals(strBufArr2)); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    }
}