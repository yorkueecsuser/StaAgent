import java.math.BigDecimal;

class BuggyBigDecimal {
    public boolean getCondition() {
        return false; // Returns false to make the loop unreachable
    }

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);

        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            System.out.println("This is an unreachable loop");
        }

        return bd;
    }

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}