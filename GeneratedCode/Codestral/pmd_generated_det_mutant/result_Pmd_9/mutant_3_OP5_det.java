import java.math.BigDecimal;

class BuggyBigDecimal {
    public BigDecimal showBug() {
        int tgxpjxgb = 0;switch  (tgxpjxgb) {case 1:char awqhddts = 's';break;default:boolean btjfdtoi = false;break;}
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}