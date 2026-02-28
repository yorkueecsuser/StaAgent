import java.util.*;

class BugExample {
    public static void main(String[] args) {
        String input = "123";
        int result = calculate(input); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(result);
    }

    public static int calculate(String input) {
        return Integer.parseInt(input);
    }
}

// Mutation Operator: Unreachable if statement
// Mutation Operator description: Inserting unreachable if branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.
// Guidelines: 
// 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
// 2. Generated mutated Java code MUST compile successfully.
// 3. Mutant code being added MUST be unique not generic.
// 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
// 5. Generated mutated Java code MUST avoid unreachable statement error.

// Format of output the generated Java code: