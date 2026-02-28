import java.util.Arrays;

class ConsecutiveLiteralAppends {
    private boolean condition = false; // Mutation: added a new variable that is always false

    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveLiteralAppends
        buf.append(" "); // BUG: ConsecutiveLiteralAppends
        buf.append("World"); // BUG: ConsecutiveLiteralAppends

        while (condition) { // Mutation: inserted an unreachable while loop
            // Mutation: added a generic (but still unreachable) code block
            int a = 1;
            int b = 2;
            int c = a + b;
        }

        return buf.toString();
    }

    public boolean getCondition() { // Mutation: added a new method that always returns false
        return false;
    }
}