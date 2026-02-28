import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveLiteralAppends
        buf.append(" "); // BUG: ConsecutiveLiteralAppends
        buf.append(" "); // Mutant: Duplication operator (Duplicating a randomly selected assignment statement and insert immediately after its current location)
        buf.append("World"); // BUG: ConsecutiveLiteralAppends
        return buf.toString();
    }
}