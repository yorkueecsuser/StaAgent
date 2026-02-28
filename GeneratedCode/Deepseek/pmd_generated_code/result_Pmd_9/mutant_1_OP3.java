import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1); // BUG: AvoidDecimalLiteralsInBigDecimalConstructor
        boolean shouldExecute = getCondition();
        if (!shouldExecute) {
            // Unreachable code
            System.out.println("Unreachable code");
        }
        return bd;
    }

    public static boolean getCondition() {
        return false;
    }
}