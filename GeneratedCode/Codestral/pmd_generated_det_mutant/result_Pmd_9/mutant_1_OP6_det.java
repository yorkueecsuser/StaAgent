import java.math.BigDecimal;

class BuggyBigDecimal {
    public BigDecimal showBug() {
        for  (int reduwlqe = 0; reduwlqe < 0; reduwlqe++) {double rsefbxcr = -319589702;}
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    
}

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}