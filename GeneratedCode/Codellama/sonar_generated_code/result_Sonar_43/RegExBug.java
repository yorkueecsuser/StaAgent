import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String str = "This is a string with a [ in it";
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean matches = pattern.matcher(str).matches();
        System.out.println(matches);

        // Mutation operator: Unreachable while loop
        // Description: Inserting unreachable while loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
        // Guidelines:
        // 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
        // 2. Generated mutated Java code MUST compile successfully.
        // 3. Mutant code being added MUST be unique not generic.
        // 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
        // 5. Generated mutated Java code MUST avoid unreachable statement error.
        // Strictly follow these guidelines to AVOID unreachable statement errors:
        // 1. If Statements: NEVER use compile-time constants like `false` directly. Instead, use a non-final variable or an equivalent method call.
        // 2. While Loops: NEVER use `false` directly as the loop condition. Instead, use a non-final variable or an equivalent method call.
        // 3. For Loops: NEVER use `false` directly as the loop condition. Instead, use a non-final variable or an equivalent method call.
        // 4. If-Else Statements: Do NOT use compile-time constants like `false` directly in conditions, especially if they make an entire branch unreachable.
        // 5. Switch Statements: NEVER use compile-time constants directly for the switch expression. Instead, use a non-final variable or an equivalent method call.
        // 6. General Rule: ALWAYS ensure that the condition of any control structure (`if`, `while`, `for`, `switch`) is dynamically determined at runtime.

        // Mutated code:
        boolean condition = getCondition();
        while (condition) {
            // do nothing
        }
    }

    private static boolean getCondition() {
        return false;
    }
}