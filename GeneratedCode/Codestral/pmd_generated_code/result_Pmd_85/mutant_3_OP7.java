import java.math.BigDecimal;

class ImmutableOperationBug {
    public static BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(10);
        bd.add(new BigDecimal(5)); // BUG: UselessOperationOnImmutable

        // Mutation: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code block is unreachable as the condition is always false
            System.out.println("Unreachable code block");
        }

        return bd;
    }

    private static boolean getCondition() {
        // Always return false to make the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        BigDecimal result = showBug();
        System.out.println("The result should be 10, but it is: " + result);
    }
}