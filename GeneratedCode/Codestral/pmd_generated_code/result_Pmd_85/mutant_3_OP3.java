import java.math.BigDecimal;

class ImmutableOperationBug {
    public static BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(10);
        bd.add(new BigDecimal(5)); // BUG: UselessOperationOnImmutable

        // Mutant Code: Unreachable if statement
        boolean alwaysFalse = getFalseCondition();
        if (alwaysFalse) {
            System.out.println("This statement is unreachable");
        }

        return bd;
    }

    public static boolean getFalseCondition() {
        return false; // Always returns false
    }

    public static void main(String[] args) {
        BigDecimal result = showBug();
        System.out.println("The result should be 10, but it is: " + result);
    }
}