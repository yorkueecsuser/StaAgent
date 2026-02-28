class UnaryPrefixOperatorsBug {
    public static void main(String[] args) {
        int i = 1;
        int j = - - -i;  // Noncompliant: equivalent to "-i"
        int k = ~~~i;    // Noncompliant: equivalent to "~i"
        int m = + +i;    // Noncompliant: equivalent to "i"

        boolean b = false;
        boolean c =!!!b;   // Noncompliant

        System.out.println("j: " + j);
        System.out.println("k: " + k);
        System.out.println("m: " + m);
        System.out.println("c: " + c);

        // Mutation Operator: Unreachable for loop
        // Mutation Operator description: Inserting unreachable for loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
        // Core Requirements:
        // 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
        // 2. Generated mutated Java code MUST compile successfully.
        // 3. Mutant code being added MUST be unique not generic.
        // 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
        // 5. Generated mutated Java code MUST avoid unreachable statement error.

        // STRICTLY follow these guidelines to AVOID unreachable statement errors:

        // 1. If Statements: NEVER use compile-time constants like `false` directly. Instead, use a non-final variable or an equivalent method call.
        // Correct: `boolean condition = getCondition(); if (condition) { /* code */ }`
        // Incorrect: `if (false) { /* code */ }`

        // 2. While Loops: NEVER use `false` directly as the loop condition. Instead, use a non-final variable or an equivalent method call.
        // Correct: `boolean conditionWhile = getCondition(); while (conditionWhile) { /* code */ }`
        // Incorrect: `while (false) { /* code */ }`

        // 3. For Loops: NEVER use `false` directly as the loop condition. Instead, use a non-final variable or an equivalent method call.
        // Correct: `boolean conditionFor = getCondition(); for (int i = 0; conditionFor; i++) { /* code */ }`
        // Incorrect: `for (int i = 0; false; i++) { /* code */ }`

        // 4. If-Else Statements: Do NOT use compile-time constants like `false` directly in conditions, especially if they make an entire branch unreachable.
        // Correct: `boolean shouldRun = getCondition(); if (shouldRun) { /* code */ } else { /* alternative code */ }`
        // Incorrect: `if (false) { /* code */ } else { /* code */ }`

        // 5. Switch Statements: NEVER use compile-time constants directly for the switch expression. Instead, use a non-final variable or an equivalent method call.
        // Correct: `int value = getValue(); switch(value) { case 1: /* code */ break; }`
        // Incorrect: `switch (0) { case 1: /* code */ break; }`

        // 6. General Rule: ALWAYS ensure that the condition of any control structure (`if`, `while`, `for`, `switch`) is dynamically determined at runtime.

        // Unreachable for loop mutation operator applied to if-else statement
        boolean flag = false;
        if (flag) {
            System.out.println("This code is reachable.");
        } else {
            for (int i = 0; false; i++) {
                System.out.println("This loop is unreachable.");
            }
            System.out.println("This code is unreachable.");
        }

        // Unreachable for loop mutation operator applied to while loop
        int count = 0;
        while (count < 5) {
            System.out.println("This loop is reachable.");
            count++;
        }
        for (int i = 0; false; i++) {
            System.out.println("This loop is unreachable.");
        }

        // Unreachable for loop mutation operator applied to for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("This loop is reachable.");
        }
        for (int i = 0; false; i++) {
            System.out.println("This loop is unreachable.");
        }
    }
}