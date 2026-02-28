import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveLiteralAppends
        buf.append(" "); // BUG: ConsecutiveLiteralAppends
        buf.append("World"); // BUG: ConsecutiveLiteralAppends
        boolean unreachable = false;
        if (!unreachable) {
            // This code block is the mutant: Unreachable if statement
            // The condition `false` of the if statement is always false, making it unreachable.
            // The original program code remains unchanged.
            buf.append("Mutant");
        }
        return buf.toString();
    }
}