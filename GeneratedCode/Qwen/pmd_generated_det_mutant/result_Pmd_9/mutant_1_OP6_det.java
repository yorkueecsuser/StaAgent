import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        for  (int lnprpvog = 0; lnprpvog < 0; lnprpvog++) {double znsrfxmx = 981344152;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Buggy BigDecimal value: " + example.showBug());
    }
}