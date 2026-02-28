import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveLiteralAppends
        buf.append(" "); // BUG: ConsecutiveLiteralAppends
        buf.append("World"); // BUG: ConsecutiveLiteralAppends
        
        /* This unreachable while loop was inserted to avoid unreachable statement error */
        // Mutation: Unreachable While Loop
        boolean condition = false;
        while (condition) {
            System.out.println("This is an unreachable loop.");
        }

        return buf.toString();
    }
}