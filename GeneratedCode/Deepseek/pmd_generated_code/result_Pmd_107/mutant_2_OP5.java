import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveLiteralAppends
        buf.append(" "); // BUG: ConsecutiveLiteralAppends
        buf.append("World"); // BUG: ConsecutiveLiteralAppends
        
        // Unreachable switch statement mutation
        switch("This switch statement is unreachable") {
            default:
                break;
        }

        return buf.toString();
    }
}