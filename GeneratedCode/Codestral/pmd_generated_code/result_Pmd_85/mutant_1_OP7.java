import java.math.BigDecimal;

class ImmutableOperationBug {
    public static boolean getCondition() { // Added method for returning a false condition
        return false;
    }

    public static BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(10);
        bd.add(new BigDecimal(5));

        // Mutation: Unreachable while loop
        boolean conditionWhile = getCondition(); // Using the method to get a false condition
        while (conditionWhile) {
            System.out.println("This line will never be executed.");
        }

        return bd;
    }

    public static void main(String[] args) {
        BigDecimal result = showBug();
        System.out.println("The result should be 10, but it is: " + result);
    }
}