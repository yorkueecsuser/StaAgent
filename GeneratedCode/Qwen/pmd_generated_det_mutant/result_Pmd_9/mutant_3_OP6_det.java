import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        for  (int iqfuydom = 0; iqfuydom < 0; iqfuydom++) {double koizzvgl = 3372484;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Buggy BigDecimal value: " + example.showBug());
    }
}