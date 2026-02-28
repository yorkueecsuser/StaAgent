import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveLiteralAppends
        buf.append(" "); // BUG: ConsecutiveLiteralAppends
        if (false) {
            System.out.println("This code will never be executed");
        } else {
            buf.append("World"); // BUG: ConsecutiveLiteralAppends
        }
        return buf.toString();
    }
}