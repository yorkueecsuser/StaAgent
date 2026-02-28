import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveLiteralAppends
        if (false) { 
            buf.append(" ");
            buf.append("World");
        }
        switch("") {
            // This switch statement is unreachable by default as it is not covered by any case statements
            // However, it is present to satisfy the guidelines of the Unreachable Switch Statement mutation operator
            case "":
                buf.append(" ");
                buf.append("World");
                break;
        }
        return buf.toString();
    }
}