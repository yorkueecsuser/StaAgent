import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveLiteralAppends
        buf.append(" "); // BUG: ConsecutiveLiteralAppends
        buf.append("World"); // BUG: ConsecutiveLiteralAppends

        String deadStore = "abcdefgh"; // Mutation: Dead Store
        return buf.toString();
    }
}