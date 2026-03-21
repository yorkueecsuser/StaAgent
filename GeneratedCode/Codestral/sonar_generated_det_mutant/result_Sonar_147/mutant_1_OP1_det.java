import java.math.BigDecimal;

class BigDecimalBug {

    public BigDecimal showBug() {
        float odzkpzdb = 456579676;
        BigDecimal value = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        return value;
    
}

    public static void main(String[] args) {
        BigDecimalBug bug = new BigDecimalBug();
        System.out.println(bug.showBug());
    }
}