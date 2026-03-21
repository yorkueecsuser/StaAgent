import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static BigDecimal showBug() {
        int tsveozey = 0;switch  (tsveozey) {case 1:boolean zlqkuopa = false;break;default:boolean xrwzipmy = false;break;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}
}