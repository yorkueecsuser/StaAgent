import java.math.BigDecimal;

class ImmutableOperationBug {
    private static boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public static BigDecimal showBug() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable as the condition is always false
        }

        BigDecimal bd = new BigDecimal(10);
        bd.add(new BigDecimal(5)); // BUG: UselessOperationOnImmutable
        return bd;
    }

    public static void main(String[] args) {
        BigDecimal result = showBug();
        System.out.println("The result should be 10, but it is: " + result);
    }
}