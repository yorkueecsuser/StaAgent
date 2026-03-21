import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveLiteralAppends
        buf.append(" "); // BUG: ConsecutiveLiteralAppends
        for  (int xgmxdpgx = 0; xgmxdpgx < 0; xgmxdpgx++) {float ieaexghj = -237500759;}
        buf.append("World"); // BUG: ConsecutiveLiteralAppends
        return buf.toString();
    
}
}