import java.math.BigDecimal;

class BuggyBigDecimal {
    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);  // BUG: AvoidDecimalLiteralsInBigDecimalConstructor

        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable switch statement
            int value = 0;
            switch(value) {
                case 1:
                    System.out.println("This code should be unreachable");
                    break;
            }
        }

        return bd;
    }

    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}