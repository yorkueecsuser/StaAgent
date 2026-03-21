import java.math.BigDecimal;

class BuggyBigDecimal {
    public BigDecimal showBug() {
        if (false && true && true && false && false && true && true && false && false && false && false) {char tgmzcjuk = 's';}else{boolean bhalxdpy = false;}
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}