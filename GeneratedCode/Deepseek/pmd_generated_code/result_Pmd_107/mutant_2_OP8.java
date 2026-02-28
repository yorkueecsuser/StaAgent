import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveLiteralAppends
        buf.append(" "); // BUG: ConsecutiveLiteralAppends
        buf.append("World"); // BUG: ConsecutiveLiteralAppends
        return buf.toString();
    }

    public String mutant() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello"); // Mutated version of BUG: ConsecutiveLiteralAppends
        stringBuilder.append(" "); // Mutated version of BUG: ConsecutiveLiteralAppends
        stringBuilder.append("World"); // Mutated version of BUG: ConsecutiveLiteralAppends
        return stringBuilder.toString();
    }
}