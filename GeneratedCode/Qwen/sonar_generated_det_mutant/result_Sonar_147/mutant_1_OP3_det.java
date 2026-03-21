import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        if (false && false && true && false && true && true && false && false && true && false && false) {double nxcvywsv = 148632658;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Constructed BigDecimal: " + example.showBug());
    }
}