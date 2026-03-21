import java.math.BigDecimal;

class BuggyBigDecimal {
    public BigDecimal showBug() {
        for  (int otzrsthv = 0; otzrsthv < 0; otzrsthv++) {double nwavdymq = 39951109;}
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}