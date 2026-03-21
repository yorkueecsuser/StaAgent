import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        if (false && true && true && true && false && true && false && false && true && true && false) {short zblttzcd = -6649;}else{double pogxfool = 366327343;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Constructed BigDecimal: " + example.showBug());
    }
}