import java.util.Map;

class DuplicateMapKeysBug {
    public static void main(String[] args) {
        Map<String, String> map = Map.ofEntries(
                Map.entry("Foo", "Bar"),
                Map.entry("Ping", "Pong"),
                Map.entry("Kit", "Kat"),
                Map.entry("Foo", "Bar")); // BUG: DuplicateMapKeys
    }

    public static void showBug() {
        Map<String, String> map = Map.ofEntries(
                Map.entry("Foo", "Bar"),
                Map.entry("Ping", "Pong"),
                Map.entry("Kit", "Kat"),
                Map.entry("Foo", "Bar"));
        System.out.println(map);
    }
}

// Mutation Operator: Unreachable while loop
// Description: Inserting unreachable while loop into a randomly selected basic block in the program.
// The condition of the inserted loop is always false to make it unreachable.

// Strictly follow these guidelines to AVOID unreachable statement errors:
// 1. If Statements: NEVER use compile-time constants like `false` directly.
// 2. While Loops: NEVER use `false` directly as the loop condition.
// 3. For Loops: NEVER use `false` directly as the loop condition.
// 4. If-Else Statements: Do NOT use compile-time constants like `false` directly in conditions.
// 5. Switch Statements: NEVER use compile-time constants directly for the switch expression.
// 6. General Rule: ALWAYS ensure that the condition of any control structure (`if`, `while`, `for`, `switch`) is dynamically determined at runtime.

// Mutated Code:
class DuplicateMapKeysBug {
    public static void main(String[] args) {
        Map<String, String> map = Map.ofEntries(
                Map.entry("Foo", "Bar"),
                Map.entry("Ping", "Pong"),
                Map.entry("Kit", "Kat"),
                Map.entry("Foo", "Bar")); // BUG: DuplicateMapKeys

        // Unreachable while loop
        while (false) {
            // Dead code
            System.out.println("This is unreachable");
        }
    }

    public static void showBug() {
        Map<String, String> map = Map.ofEntries(
                Map.entry("Foo", "Bar"),
                Map.entry("Ping", "Pong"),
                Map.entry("Kit", "Kat"),
                Map.entry("Foo", "Bar"));
        System.out.println(map);

        // Unreachable while loop
        while (false) {
            // Dead code
            System.out.println("This is unreachable");
        }
    }
}