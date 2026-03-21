import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        for  (int mngxeisr = 0; mngxeisr < 0; mngxeisr++) {int reynfjgo = -244939547;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Constructed BigDecimal: " + example.showBug());
    }
}