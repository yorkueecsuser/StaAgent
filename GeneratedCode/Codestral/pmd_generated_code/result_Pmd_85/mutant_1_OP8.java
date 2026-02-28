import java.math.BigDecimal;

class ImmutableOperationBug {
    public static BigDecimal showBug() {
        BigDecimal a = new BigDecimal(10);
        a.add(new BigDecimal(5)); // BUG: UselessOperationOnImmutable
        return a;
    }

    public static void main(String[] args) {
        BigDecimal b = showBug();
        System.out.println("The result should be 10, but it is: " + b);
    }
}