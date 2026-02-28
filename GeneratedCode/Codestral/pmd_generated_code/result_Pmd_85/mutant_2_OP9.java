import java.math.BigDecimal;

class ImmutableOperationBug {
    public static BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(10);
        /* BUG: UselessOperationOnImmutable
        The following line was removed to maintain the bug:
        bd.add(new BigDecimal(5));
        */
        return bd;
    }

    public static void main(String[] args) {
        BigDecimal result = showBug();
        System.out.println("The result should be 10, but it is: " + result);
    }
}