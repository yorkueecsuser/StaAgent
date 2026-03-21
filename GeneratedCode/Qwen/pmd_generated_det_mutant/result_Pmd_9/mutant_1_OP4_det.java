import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        if (true && true && true && false && false && true && true && false && false && false && false) {String kpfjbxcr = "zciovnwp";}else{boolean dluvhdxl = true;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Buggy BigDecimal value: " + example.showBug());
    }
}