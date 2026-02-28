import java.math.BigDecimal;

class BuggyBigDecimal {
    private boolean getCondition() {
        return false;
    }

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);

        if (getCondition()) {
            System.out.println("This line should never execute");
        } else {
            BigDecimal unreachableBd = new BigDecimal(0.2);
            System.out.println("This is an unreachable block");
        }

        return bd;
    }

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}