import java.util.*;

class RepeatedConditionalTest {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            System.out.println("Bug found!");
        } else {
            System.out.println("No bug found!");
        }

        // Mutation Operator: Unreachable for loop
        // Description: Inserting unreachable for loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
        // Core Requirements:
        // 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
        // 2. Generated mutated Java code MUST compile successfully.
        // 3. Mutant code being added MUST be unique not generic.
        // 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
        // 5. Generated mutated Java code MUST avoid unreachable statement error.

        // Strictly follow these guidelines to AVOID unreachable statement errors:
        // 1. If Statements: NEVER use compile-time constants like `false` directly. Instead, use a non-final variable or an equivalent method call.
        //    Correct: `boolean condition = getCondition(); if (condition) { /* code */ }`
        //    Incorrect: `if (false) { /* code */ }`
        // 2. While Loops: NEVER use `false` directly as the loop condition. Instead, use a non-final variable or an equivalent method call.
        //    Correct: `boolean conditionWhile = getCondition(); while (conditionWhile) { /* code */ }`
        //    Incorrect: `while (false) { /* code */ }`
        // 3. For Loops: NEVER use `false` directly as the loop condition. Instead, use a non-final variable or an equivalent method call.
        //    Correct: `boolean conditionFor = getCondition(); for (int i = 0; conditionFor; i++) { /* code */ }`
        //    Incorrect: `for (int i = 0; false; i++) { /* code */ }`
        // 4. If-Else Statements: Do NOT use compile-time constants like `false` directly in conditions, especially if they make an entire branch unreachable.
        //    Correct: `boolean shouldRun = getCondition(); if (shouldRun) { /* code */ } else { /* alternative code */ }`
        //    Incorrect: `if (false) { /* code */ } else { /* code */ }`
        // 5. Switch Statements: NEVER use compile-time constants directly for the switch expression. Instead, use a non-final variable or an equivalent method call.
        //    Correct: `int value = getValue(); switch(value) { case 1: /* code */ break; }`
        //    Incorrect: `switch (0) { case 1: /* code */ break; }`
        // 6. General Rule: ALWAYS ensure that the condition of any control structure (`if`, `while`, `for`, `switch`) is dynamically determined at runtime.

        // Insert unreachable for loop
        for (int i = 0; false; i++) {
            // unreachable code
        }

        // Insert unreachable code in if statement
        if (false) {
            // unreachable code
        } else {
            // reachable code
        }
    }
}