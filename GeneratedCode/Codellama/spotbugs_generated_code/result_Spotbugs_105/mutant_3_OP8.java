import java.util.Arrays;

class IncompatibleArrayCompareBug {
    public static void main(String[] args) {
        String[] strArr1 = {"hello", "world"};
        StringBuffer[] strBufArr2 = {new StringBuffer("hello"), new StringBuffer("world")};
        System.out.println(strArr1.equals(strBufArr2)); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)

        // Mutation Operator: Renaming
        // Description: Renaming user-defined variables declared in a program. If there exist multiple variables, we randomly select one for the mutation. The new name of the variable will be in the form of [a-z].
        // Core Requirements:
        // 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
        // 2. Generated mutated Java code MUST compile successfully.
        // 3. Mutant code being added MUST be unique not generic.
        // 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
        // 5. Generated mutated Java code MUST avoid unreachable statement error.

        // Mutated code:
        String[] strArr1_mut = {"hello", "world"};
        StringBuffer[] strBufArr2_mut = {new StringBuffer("hello"), new StringBuffer("world")};
        System.out.println(strArr1_mut.equals(strBufArr2_mut)); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    }
}