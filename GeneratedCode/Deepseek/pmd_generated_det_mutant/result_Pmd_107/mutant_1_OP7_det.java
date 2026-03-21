import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveLiteralAppends
        buf.append(" "); // BUG: ConsecutiveLiteralAppends
        boolean xcwpshwe = false;while (xcwpshwe && false && false && false && true && true && true && true && true && true && true && false) {short bmphqbmj = 5032;}
        buf.append("World"); // BUG: ConsecutiveLiteralAppends
        return buf.toString();
    
}
}