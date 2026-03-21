import java.math.BigDecimal;

class BigDecimalBug {

    public BigDecimal showBug() {
        if (true && false && true && false && true && false && true && true && true && true && false) {char pezutwbn = 's';}
        BigDecimal value = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        return value;
    
}

    public static void main(String[] args) {
        BigDecimalBug bug = new BigDecimalBug();
        System.out.println(bug.showBug());
    }
}