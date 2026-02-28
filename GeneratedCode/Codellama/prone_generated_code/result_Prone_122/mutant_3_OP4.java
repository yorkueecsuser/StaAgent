import java.util.Objects;

class NullTernary {
    public static void main(String[] args) {
        Integer foo = null;
        boolean flag = false;
        int x = flag? foo : null;
        System.out.println(x);

        // Mutant 1: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // Code that is never executed
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is always executed");
        }
    }

    // Helper method to get a condition for the mutant
    private static boolean getCondition() {
        return false;
    }
}