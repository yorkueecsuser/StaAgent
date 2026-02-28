import java.math.BigDecimal;

class ImmutableOperationBug {
    public static BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(10);
        bd.add(new BigDecimal(5)); // BUG: UselessOperationOnImmutable

        // Mutation: Unreachable while loop
        while (isFalse()) {
            // This code is unreachable
        }

        return bd;
    }

    // Method that always returns false
    private static boolean isFalse() {
        return false;
    }

    public static void main(String[] args) {
        BigDecimal result = showBug();
        System.out.println("The result should be 10, but it is: " + result);
    }
}