import java.math.BigDecimal;

class ImmutableOperationBug {
    public static BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(10);
        bd.add(new BigDecimal(5)); // BUG: UselessOperationOnImmutable

        // Mutant code: Unreachable switch statement
        int value = -1;
        switch (value) {
            case 1:
                System.out.println("This code should not be executed.");
                break;
            case 2:
                System.out.println("This code should also not be executed.");
                break;
            default:
                break;
        }

        return bd;
    }

    public static void main(String[] args) {
        BigDecimal result = showBug();
        System.out.println("The result should be 10, but it is: " + result);
    }
}