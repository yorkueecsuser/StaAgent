import java.math.BigDecimal;

class ImmutableOperationBug {
    public static BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(10);
        bd.add(new BigDecimal(5)); // BUG: UselessOperationOnImmutable

        // Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This should never be printed!");
        } else {
            // This else block will never be executed
            System.out.println("This block is unreachable!");
        }

        return bd;
    }

    public static boolean getUnreachableCondition() {
        // This method always returns false, making the if-else statement unreachable
        return false;
    }

    public static void main(String[] args) {
        BigDecimal result = showBug();
        System.out.println("The result should be 10, but it is: " + result);
    }
}