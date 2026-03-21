import java.math.BigDecimal;

class BigDecimalBug {

    public BigDecimal showBug() {
        boolean bmpjioke = false;while (bmpjioke && true && false && false && true && true && true && false && true && true && true && false) {char xuflaokr = 'l';}
        BigDecimal value = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        return value;
    
}

    public static void main(String[] args) {
        BigDecimalBug bug = new BigDecimalBug();
        System.out.println(bug.showBug());
    }
}