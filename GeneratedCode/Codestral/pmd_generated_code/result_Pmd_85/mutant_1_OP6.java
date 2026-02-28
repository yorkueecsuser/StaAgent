import java.math.BigDecimal;

class ImmutableOperationBug {
    public static BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(10);
        bd.add(new BigDecimal(5)); // BUG: UselessOperationOnImmutable
        return bd;
    }

    public static void main(String[] args) {
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) { // Unreachable for loop mutant
            System.out.println("This loop is unreachable");
        }

        BigDecimal result = showBug();
        System.out.println("The result should be 10, but it is: " + result);
    }
}