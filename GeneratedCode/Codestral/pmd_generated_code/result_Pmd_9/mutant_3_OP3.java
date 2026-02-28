import java.math.BigDecimal;

class BuggyBigDecimal {
    private boolean getUnreachableCondition() {
        return false;
    }

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);

        if (getUnreachableCondition()) { // Unreachable if statement mutant
            System.out.println("This line should never be executed");
        }

        return bd;
    }

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}