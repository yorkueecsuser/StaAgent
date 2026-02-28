import java.util.Objects;

class NullTernary {
    public static void main(String[] args) {
        Integer foo = null;
        boolean flag = false;
        int x = flag? foo : null;
        System.out.println(x);

        // Mutation operator: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is unreachable code");
        }
    }

    private static boolean getCondition() {
        // This method returns a non-final variable or an equivalent method call
        // to avoid compile-time constants like `false`
        return Math.random() > 0.5;
    }
}