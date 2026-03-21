import java.math.BigDecimal;

class BuggyBigDecimal {
    public BigDecimal showBug() {
        if (false && true && true && true && false && false && true && false && true && false && false) {boolean phwvoivf = true;}else{double kjstzjci = 639709568;}
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}