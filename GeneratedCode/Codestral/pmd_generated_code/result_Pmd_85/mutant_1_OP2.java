import java.math.BigDecimal;

class ImmutableOperationBug {
    public static BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(10);
        BigDecimal bd2 = new BigDecimal(10); // Mutant: Duplication of the assignment statement
        bd.add(new BigDecimal(5)); // BUG: UselessOperationOnImmutable
        return bd;
    }

    public static void main(String[] args) {
        BigDecimal result = showBug();
        System.out.println("The result should be 10, but it is: " + result);
    }
}