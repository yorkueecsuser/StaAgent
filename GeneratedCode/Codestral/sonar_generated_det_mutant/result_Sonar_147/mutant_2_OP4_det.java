import java.math.BigDecimal;

class BigDecimalBug {

    public BigDecimal showBug() {
        if (false && true && true && false && false && false && false && true && true && true && false) {double tfkmijag = 685585765;}else{long sngxhxaf = 983350370;}
        BigDecimal value = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        return value;
    
}

    public static void main(String[] args) {
        BigDecimalBug bug = new BigDecimalBug();
        System.out.println(bug.showBug());
    }
}