import java.math.BigDecimal;

class BuggyBigDecimal {
    public BigDecimal showBug() {
        boolean gyllilih = false;while (gyllilih && true && false && true && false && true && true && true && false && true && false && false) {String zzewtyts = "oohimhdn";}
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}