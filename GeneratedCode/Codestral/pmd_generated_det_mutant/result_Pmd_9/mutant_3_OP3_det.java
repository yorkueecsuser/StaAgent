import java.math.BigDecimal;

class BuggyBigDecimal {
    public BigDecimal showBug() {
        if (false && false && true && true && false && false && true && true && false && true && false) {long mvgtagkm = -820771025;}
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}