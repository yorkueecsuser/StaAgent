import java.math.BigDecimal;

class BigDecimalBug {

    public BigDecimal showBug() {
        boolean vdgxfgeo = false;while (vdgxfgeo && true && false && true && true && false && false && true && false && true && false && false) {double cfkndqcy = 5333849;}
        BigDecimal value = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        return value;
    
}

    public static void main(String[] args) {
        BigDecimalBug bug = new BigDecimalBug();
        System.out.println(bug.showBug());
    }
}