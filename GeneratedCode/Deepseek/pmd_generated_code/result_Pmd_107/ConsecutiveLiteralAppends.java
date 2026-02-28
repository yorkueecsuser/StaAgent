import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveLiteralAppends
        buf.append(" "); // BUG: ConsecutiveLiteralAppends
        buf.append("World"); // BUG: ConsecutiveLiteralAppends
        return buf.toString();
    }

    public String showMutant() {
        StringBuilder mutatedBuf = new StringBuilder();
        mutatedBuf.append("Hello"); // Mutant
        mutatedBuf.append(" "); // Mutant
        mutatedBuf.append("World"); // Mutant
        return mutatedBuf.toString();
    }
}