import java.math.BigDecimal;

class BigDecimalBug {

    public BigDecimal showBug() {
        if (true && false && true && true && false && true && true && false && false && false && false) {float sztlchqb = 477055886;}else{byte crupjynx = 35;}
        BigDecimal value = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        return value;
    
}

    public static void main(String[] args) {
        BigDecimalBug bug = new BigDecimalBug();
        System.out.println(bug.showBug());
    }
}