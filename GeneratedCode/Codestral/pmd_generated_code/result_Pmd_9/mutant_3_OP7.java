import java.math.BigDecimal;

class BuggyBigDecimal {
    public boolean getCondition() {
        return false;
    }

    public BigDecimal showBug() {
        while (getCondition()) {
            System.out.println("Unreachable code block");
        }

        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        return bd;
    }

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}