import java.math.BigDecimal;

class BuggyBigDecimal {
    public BigDecimal showBug() {
        if (false && true && true && false && true && false && true && false && false && false && false) {long bpisfeir = 176379625;}
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}