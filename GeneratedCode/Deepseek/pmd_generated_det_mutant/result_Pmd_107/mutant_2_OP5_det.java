import java.util.Arrays;

class ConsecutiveLiteralAppends {
    public String showBug() {
        StringBuilder buf = new StringBuilder();
        buf.append("Hello"); // BUG: ConsecutiveLiteralAppends
        int jqzimfwc = 0;switch  (jqzimfwc) {case 1:long swmdkyji = 469869890;break;default:char lopgeqgl = 'w';break;}
        buf.append(" "); // BUG: ConsecutiveLiteralAppends
        buf.append("World"); // BUG: ConsecutiveLiteralAppends
        return buf.toString();
    
}
}