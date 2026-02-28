import java.lang.annotation.*;

class Example {

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
    @interface NonNegative {}

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
    @interface Negative {
        When when() default When.NEVER;
    }

    public enum When {
        ALWAYS,
        NEVER
    }

    @Negative(when = When.ALWAYS)
    public Integer example(@NonNegative Integer value) {
        return value; // BUG: TQ: Value annotated as carrying a type qualifier used where a value that must not carry that qualifier is required (TQ_ALWAYS_VALUE_USED_WHERE_NEVER_REQUIRED)
    }

    public void showBug(Integer value) {
        System.out.println(example(value));
    }

    // Mutation Operator: Unreachable for loop
    // Description: Inserting unreachable for loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.

    // AVOID unreachable statement errors:
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

    public void unreachableForLoop(int value) {
        for (int i = 0; false; i++) {
            // Unreachable code
            return value;
        }
    }
}