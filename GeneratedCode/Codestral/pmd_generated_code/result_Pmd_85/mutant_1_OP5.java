import java.math.BigDecimal;

class ImmutableOperationBug {
    public static BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(10);
        bd.add(new BigDecimal(5)); // BUG: UselessOperationOnImmutable

        // Mutant code: Unreachable switch statement
        int value = getNonReachableValue();
        switch(value) {
            case 1:
                // Unreachable code
                System.out.println("This code is unreachable.");
                break;
        }

        return bd;
    }

    private static int getNonReachableValue() {
        // This method always returns a value that is not 1 to make the switch statement unreachable
        return 0;
    }

    public static void main(String[] args) {
        BigDecimal result = showBug();
        System.out.println("The result should be 10, but it is: " + result);
    }
}