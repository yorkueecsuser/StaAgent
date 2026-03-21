import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveLiteralAppends
        buf.append(" "); // BUG: ConsecutiveLiteralAppends
        int lsdflsug = 0;switch  (lsdflsug) {case 1:double yrockdbq = -192805117;break;default:int njqxyiia = -64277829;break;}
        buf.append("World"); // BUG: ConsecutiveLiteralAppends
        return buf.toString();
    
}
}