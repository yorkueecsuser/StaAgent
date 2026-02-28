import java.math.BigDecimal;

class ImmutableOperationBug {
    public static BigDecimal showBug() {
        // Adding a dead store mutant
        int unusedVariable = 12345678;

        BigDecimal bd = new BigDecimal(10);
        bd.add(new BigDecimal(5)); // BUG: UselessOperationOnImmutable
        return bd;
    }

    public static void main(String[] args) {
        BigDecimal result = showBug();
        System.out.println("The result should be 10, but it is: " + result);
    }
}