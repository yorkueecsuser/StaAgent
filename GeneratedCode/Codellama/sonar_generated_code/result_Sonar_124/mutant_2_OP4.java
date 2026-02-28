import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        float c = a / b; // BUG: Math operands should be cast before assignment
        System.out.println(c);

        // Mutation Operator: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // code
        } else {
            // unreachable code
        }
    }

    private static boolean getCondition() {
        return Math.random() > 0.5;
    }
}