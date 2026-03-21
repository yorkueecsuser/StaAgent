import java.math.BigDecimal;

class BigDecimalBug {

    public BigDecimal showBug() {
        for  (int aigohnsh = 0; aigohnsh < 0; aigohnsh++) {float ktqbyuzz = 261561437;}
        BigDecimal value = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        return value;
    
}

    public static void main(String[] args) {
        BigDecimalBug bug = new BigDecimalBug();
        System.out.println(bug.showBug());
    }
}