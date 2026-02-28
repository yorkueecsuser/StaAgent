import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveLiteralAppends
        buf.append(" "); // BUG: ConsecutiveLiteralAppends
        buf.append("World"); // BUG: ConsecutiveLiteralAppends
        int value = 0; // Mutant: Unreachable Switch Statement
        switch(value) {
            case 1:
                // Do nothing
                break;
        }
        return buf.toString();
    }
}