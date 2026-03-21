import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        boolean xgwmuxcy = false;while (xgwmuxcy && false && false && true && true && true && true && false && false && false && false && false) {boolean otvorfoy = false;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Buggy BigDecimal value: " + example.showBug());
    }
}