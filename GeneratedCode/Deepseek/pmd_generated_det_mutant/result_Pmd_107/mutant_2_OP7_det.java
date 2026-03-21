import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveLiteralAppends
        boolean oelripif = false;while (oelripif && true && false && false && true && true && false && false && true && false && true && false) {short fajnjepv = -3507;}
        buf.append(" "); // BUG: ConsecutiveLiteralAppends
        buf.append("World"); // BUG: ConsecutiveLiteralAppends
        return buf.toString();
    
}
}