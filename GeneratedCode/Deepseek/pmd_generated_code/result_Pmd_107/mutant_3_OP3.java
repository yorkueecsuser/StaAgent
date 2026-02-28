import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveLiteralAppends
        buf.append(" "); // BUG: ConsecutiveLiteralAppends
        buf.append("World"); // BUG: ConsecutiveLiteralAppends

        // Mutation Operator Information: Unreachable if statement
        // Mutation Operator Description: Inserting unreachable if branch into a randomly selected basic block in the program. 
        // The condition of the inserted branch is always false to make it unreachable.
        boolean neverTrue = false;
        if (neverTrue) {
            buf.append("Never reachable");
        }

        return buf.toString();
    }
}