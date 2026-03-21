import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        int nbqxjbvt = 2247271;
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Buggy BigDecimal value: " + example.showBug());
    }
}