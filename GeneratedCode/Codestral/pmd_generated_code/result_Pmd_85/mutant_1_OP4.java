import java.math.BigDecimal;

class ImmutableOperationBug {
    public static BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(10);
        bd.add(new BigDecimal(5));

        // Mutant: Unreachable if-else statement
        if (getCondition()) {
            // This block will never be executed because getCondition() always returns false
            System.out.println("This is an unreachable block of code");
        } else {
            // This block is the alternative path that is also unreachable
            System.out.println("This is an alternative unreachable block of code");
        }

        return bd;
    }

    public static boolean getCondition() {
        // The condition is always false, making the if-else statement unreachable
        return false;
    }

    public static void main(String[] args) {
        BigDecimal result = showBug();
        System.out.println("The result should be 10, but it is: " + result);
    }
}