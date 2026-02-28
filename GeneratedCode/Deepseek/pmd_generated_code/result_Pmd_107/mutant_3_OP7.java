import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveLiteralAppends
        buf.append(" "); // BUG: ConsecutiveLiteralAppends
        buf.append("World"); // BUG: ConsecutiveLiteralAppends
        boolean unreachable = false;
        while (unreachable) { 
            // This is an unreachable loop, ensuring no unreachable statement error
        }
        return buf.toString();
    }
}