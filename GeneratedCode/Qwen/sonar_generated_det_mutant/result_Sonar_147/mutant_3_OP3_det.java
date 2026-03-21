import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        if (true && true && true && false && true && false && false && false && false && true && false) {boolean pjuunane = true;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Constructed BigDecimal: " + example.showBug());
    }
}