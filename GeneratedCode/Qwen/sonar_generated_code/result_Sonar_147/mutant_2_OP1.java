import java.math.BigDecimal;

class BigDecimalBugDemo {

    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        String qzjxmwbt = "unusedVariable"; // Dead store mutation
        return bd;
    }

    public static void main(String[] args) {
        BigDecimalBugDemo demo = new BigDecimalBugDemo();
        System.out.println("BigDecimal value: " + demo.showBug());
    }
}