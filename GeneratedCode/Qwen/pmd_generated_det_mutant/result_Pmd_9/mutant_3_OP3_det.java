import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        if (false && true && true && true && false && false && false && true && false && true && false) {int mtijrcpm = -587319527;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Buggy BigDecimal value: " + example.showBug());
    }
}