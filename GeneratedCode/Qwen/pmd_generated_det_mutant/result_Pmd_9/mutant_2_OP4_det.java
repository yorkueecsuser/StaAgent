import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug() {
        if (true && false && true && true && true && true && false && true && false && true && false) {char haowkzmh = 'p';}else{long pqrkqubd = -765844294;}
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        System.out.println("Buggy BigDecimal value: " + example.showBug());
    }
}