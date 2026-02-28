import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder s = new StringBuilder();
        s.append("Hello"); // BUG: ConsecutiveLiteralAppends
        s.append(" "); // BUG: ConsecutiveLiteralAppends
        s.append("World"); // BUG: ConsecutiveLiteralAppends
        return s.toString();
    }
}