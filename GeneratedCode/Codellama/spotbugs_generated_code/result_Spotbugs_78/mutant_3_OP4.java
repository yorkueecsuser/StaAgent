import java.util.ArrayList;

class SelfAssignment {
    private int foo;

    public void setFoo(int foo) {
        foo = foo; // BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
    }

    public int getFoo() {
        return foo;
    }

    public void showBug(int foo) {
        setFoo(foo);
        System.out.println(getFoo());
    }

    // Mutation Operator: Unreachable if-else statement
    // Description: Inserting unreachable if-else branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.
    // Core Requirements:
    // 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
    // 2. Generated mutated Java code MUST compile successfully.
    // 3. Mutant code being added MUST be unique not generic.
    // 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
    // 5. Generated mutated Java code MUST avoid unreachable statement error.

    // STRICTLY follow these guidelines to AVOID unreachable statement errors:

    // 1. IF statements: NEVER use compile-time constants like `false` directly. Instead, use a non-final variable or an equivalent method call.
    //    Correct: `boolean condition = getCondition(); if (condition) { /* code */ }`
    //    Incorrect: `if (false) { /* code */ }`

    // 2. WHILE loops: NEVER use `false` directly as the loop condition. Instead, use a non-final variable or an equivalent method call.
    //    Correct: `boolean conditionWhile = getCondition(); while (conditionWhile) { /* code */ }`
    //    Incorrect: `while (false) { /* code */ }`

    // 3. FOR loops: NEVER use `false` directly as the loop condition. Instead, use a non-final variable or an equivalent method call.
    //    Correct: `boolean conditionFor = getCondition(); for (int i = 0; conditionFor; i++) { /* code */ }`
    //    Incorrect: `for (int i = 0; false; i++) { /* code */ }`

    // 4. IF-ELSE statements: Do NOT use compile-time constants like `false` directly in conditions, especially if they make an entire branch unreachable.
    //    Correct: `boolean shouldRun = getCondition(); if (shouldRun) { /* code */ } else { /* alternative code */ }`
    //    Incorrect: `if (false) { /* code */ } else { /* code */ }`

    // 5. SWITCH statements: NEVER use compile-time constants directly for the switch expression. Instead, use a non-final variable or an equivalent method call.
    //    Correct: `int value = getValue(); switch(value) { case 1: /* code */ break; }`
    //    Incorrect: `switch (0) { case 1: /* code */ break; }`

    // 6. General Rule: ALWAYS ensure that the condition of any control structure (`if`, `while`, `for`, `switch`) is dynamically determined at runtime.

    // Format your response as follows:

    // 1. Provide the Java code enclosed in triple backticks

    // 2. Insert the mutation operator's description in a comment line before the generated code

    // 3. Insert the mutation operator's name in a comment line before the generated code

    // 4. Ensure that the generated code is enclosed in triple backticks

    // 5. Ensure that the generated code does not introduce any unreachable statement errors

    // Generated mutated Java code:

    public void showBug(int foo) {
        setFoo(foo);
        System.out.println(getFoo());
        if (false) {
            // This branch is always unreachable
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is reachable");
        }
    }
}