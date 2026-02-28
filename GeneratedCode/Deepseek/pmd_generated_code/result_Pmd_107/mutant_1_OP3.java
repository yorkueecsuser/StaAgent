import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();

        // Original code
        buf.append("Hello"); // BUG: ConsecutiveLiteralAppends
        buf.append(" "); // BUG: ConsecutiveLiteralAppends
        buf.append("World"); // BUG: ConsecutiveLiteralAppends

        // Mutation: Unreachable If Statement
        if(false) {
            buf.append("Unreachable Code"); // Mutated code
        }

        return buf.toString();
    }
}