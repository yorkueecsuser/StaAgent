import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        float c = a / b; // BUG: Math operands should be cast before assignment
        System.out.println(c);

        // Mutation Operator: Unreachable if-else statement
        // Description: Inserting unreachable if-else branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.
        // Core Requirements:
        // 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
        // 2. Generated mutated Java code MUST compile successfully.
        // 3. Mutant code being added MUST be unique not generic.
        // 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
        // 5. Generated mutated Java code MUST avoid unreachable statement error.
        // Instructions:
        // 1. Do not remove any code from the original program.
        // 2. Do not add any code that will cause compilation errors.
        // 3. The mutant code must be unique and not generic.
        // 4. The mutant code must not cause any unreachable statement errors.

        // Unreachable if-else statement mutation
        boolean condition = getCondition();
        if (condition) {
            // this branch is always false
            System.out.println("This branch is unreachable");
        } else {
            // this branch is always true
            System.out.println("This branch is reachable");
        }
    }

    // Helper method to get a non-final variable for the condition
    private static boolean getCondition() {
        return new Random().nextBoolean();
    }
}