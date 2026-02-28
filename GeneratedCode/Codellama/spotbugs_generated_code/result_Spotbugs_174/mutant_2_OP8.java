// Original code
import java.util.Arrays;

class BuggyCode {
    private static int[] array = {1, 2, 3, 4, 5};

    public static int[] getArray() {
        // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
        return array;
    }

    public static void main(String[] args) {
        int[] array = getArray();
        System.out.println(Arrays.toString(array));
        array[0] = 10;
        System.out.println(Arrays.toString(array));
    }
}

// Mutated code
import java.util.Arrays;

class BuggyCode {
    private static int[] array = {1, 2, 3, 4, 5};

    public static int[] getArray() {
        // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
        return array;
    }

    public static void main(String[] args) {
        int[] array = getArray();
        System.out.println(Arrays.toString(array));
        array[0] = 10;
        System.out.println(Arrays.toString(array));
    }
}

// Mutation Operator name: Renaming
// Mutation Operator description: Renaming user-defined variables declared in a program. If there exist multiple variables, we randomly select one for the mutation. The new name of the variable will be in the form of [a-z].
// Core Requirements:
// 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
// 2. Generated mutated Java code MUST compile successfully.
// 3. Mutant code being added MUST be unique not generic.
// 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
// 5. Generated mutated Java code MUST avoid unreachable statement error.

// Mutated code
import java.util.Arrays;

class BuggyCode {
    private static int[] array = {1, 2, 3, 4, 5};

    public static int[] getArray() {
        // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
        return array;
    }

    public static void main(String[] args) {
        int[] array = getArray();
        System.out.println(Arrays.toString(array));
        array[0] = 10;
        System.out.println(Arrays.toString(array));
    }
}

// Mutation Operator name: Renaming
// Mutation Operator description: Renaming user-defined variables declared in a program. If there exist multiple variables, we randomly select one for the mutation. The new name of the variable will be in the form of [a-z].
// Core Requirements:
// 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
// 2. Generated mutated Java code MUST compile successfully.
// 3. Mutant code being added MUST be unique not generic.
// 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
// 5. Generated mutated Java code MUST avoid unreachable statement error.

// Mutated code
import java.util.Arrays;

class BuggyCode {
    private static int[] array = {1, 2, 3, 4, 5};

    public static int[] getArray() {
        // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
        return array;
    }

    public static void main(String[] args) {
        int[] array = getArray();
        System.out.println(Arrays.toString(array));
        array[0] = 10;
        System.out.println(Arrays.toString(array));
    }
}