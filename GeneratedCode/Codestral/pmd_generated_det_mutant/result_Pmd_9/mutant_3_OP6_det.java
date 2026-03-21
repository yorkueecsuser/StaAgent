import java.math.BigDecimal;

class BuggyBigDecimal {
    public BigDecimal showBug() {
        for  (int vopzznoz = 0; vopzznoz < 0; vopzznoz++) {int jrgbygsr = 951435174;}
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}