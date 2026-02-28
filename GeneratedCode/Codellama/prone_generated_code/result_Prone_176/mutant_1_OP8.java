import java.util.List;
import java.util.ArrayList;

class XorPowerBug {
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int result = x ^ y;
        System.out.println(result); // BUG: XorPower
    }

    public static int showBug(int x, int y) {
        return x ^ y;
    }
}

/* Mutation Operator: Renaming
 * Description: Renaming user-defined variables declared in a program. If there exist multiple variables, we randomly select one for the mutation. The new name of the variable will be in the form of [a-z].
 * Core Requirements:
 * 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
 * 2. Generated mutated Java code MUST compile successfully.
 * 3. Mutant code being added MUST be unique not generic.
 * 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
 * 5. Generated mutated Java code MUST avoid unreachable statement error.
 */

import java.util.List;
import java.util.ArrayList;

class XorPowerBug {
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int result = x ^ y;
        System.out.println(result); // BUG: XorPower
    }

    public static int showBug(int x, int y) {
        return x ^ y;
    }

    /* Mutant 1: Renaming x to a */
    public static void main(String[] args) {
        int a = 2;
        int y = 2;
        int result = a ^ y;
        System.out.println(result); // BUG: XorPower
    }

    public static int showBug(int a, int y) {
        return a ^ y;
    }

    /* Mutant 2: Renaming y to b */
    public static void main(String[] args) {
        int x = 2;
        int b = 2;
        int result = x ^ b;
        System.out.println(result); // BUG: XorPower
    }

    public static int showBug(int x, int b) {
        return x ^ b;
    }
}