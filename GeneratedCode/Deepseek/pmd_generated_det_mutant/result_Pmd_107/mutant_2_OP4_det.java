import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveLiteralAppends
        buf.append(" "); // BUG: ConsecutiveLiteralAppends
        if (false && true && false && true && false && false && false && false && true && true && false) {byte jeebtnpi = 6;}else{String ppdpolry = "zvicaxcg";}
        buf.append("World"); // BUG: ConsecutiveLiteralAppends
        return buf.toString();
    
}
}