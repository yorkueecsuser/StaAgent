import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        boolean twmcbwjc = false;while (twmcbwjc && false && true && false && true && true && true && true && false && true && false && false) {int qvptofpy = 203910931;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Buggy BigDecimal value: " + example.showBug());
    }
}