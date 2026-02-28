import java.math.BigDecimal;

class ImmutableOperationBug {
    public static BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(10);
        bd.add(new BigDecimal(5)); // BUG: UselessOperationOnImmutable
        // Mutant code
        if (isFalseCondition()) {
            System.out.println("This code is unreachable.");
        }
        return bd;
    }

    private static boolean isFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        BigDecimal result = showBug();
        System.out.println("The result should be 10, but it is: " + result);
    }
}