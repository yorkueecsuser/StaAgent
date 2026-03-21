import java.math.BigDecimal;

class BuggyBigDecimal {
    public BigDecimal showBug() {
        int xcxvztym = 0;switch  (xcxvztym) {case 1:long vuaiwlgm = 152135765;break;default:byte peqbwkya = 109;break;}
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}