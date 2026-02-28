import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveLiteralAppends
        buf.append(" "); // BUG: ConsecutiveLiteralAppends
        buf.append("World"); // BUG: ConsecutiveLiteralAppends
        if (alwaysFalse()) {
            // unreachable code
            buf.append("This will never be appended");
        }
        return buf.toString();
    }

    private boolean alwaysFalse() {
        return false;
    }
}