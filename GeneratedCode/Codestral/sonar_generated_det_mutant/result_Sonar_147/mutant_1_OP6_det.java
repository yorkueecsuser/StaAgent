import java.math.BigDecimal;

class BigDecimalBug {

    public BigDecimal showBug() {
        for  (int jhwdzzfp = 0; jhwdzzfp < 0; jhwdzzfp++) {byte compdqlw = -69;}
        BigDecimal value = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        return value;
    
}

    public static void main(String[] args) {
        BigDecimalBug bug = new BigDecimalBug();
        System.out.println(bug.showBug());
    }
}