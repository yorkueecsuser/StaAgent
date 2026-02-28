import java.util.*;

class BuggyExample {
    public static void main(String[] args) {
        String[] myArray = {"Hello", "World"};
        System.out.println(myArray.toString());
        // Mutation Operator: Unreachable if statement
        // Description: Inserting unreachable if branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.
        // Core Requirements:
        // 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
        // 2. Generated mutated Java code MUST compile successfully.
        // 3. Mutant code being added MUST be unique not generic.
        // 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
        // 5. Generated mutated Java code MUST avoid unreachable statement error.
        // Inserted Mutant Code:
        // 6. Generated mutated Java code MUST NOT introduce any new syntax errors or runtime errors.
        boolean condition = getCondition();
        if (!condition) {
            // This code is unreachable because the condition is always false
            System.out.println("This statement is unreachable");
        }
    }
}