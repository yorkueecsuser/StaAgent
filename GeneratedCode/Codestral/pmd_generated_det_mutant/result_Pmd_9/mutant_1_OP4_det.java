import java.math.BigDecimal;

class BuggyBigDecimal {
    public BigDecimal showBug() {
        if (false && false && true && false && true && true && true && false && false && false && false) {String iempvthe = "lwsbtvsv";}else{short ngvkdxyw = 4075;}
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}