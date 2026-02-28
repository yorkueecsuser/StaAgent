import java.math.BigDecimal;

class BuggyBigDecimal {
    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);

        // Unreachable switch statement
        boolean condition = getCondition();
        if (condition) {
            int value = 1;
            switch (value) {
                case 2:
                    // This code is unreachable
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return bd;
    }

    private boolean getCondition() {
        // Replace this with your condition that always returns false
        return false;
    }

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}