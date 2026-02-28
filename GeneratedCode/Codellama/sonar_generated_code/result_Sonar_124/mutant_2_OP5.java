import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        float c = a / b; // BUG: Math operands should be cast before assignment
        System.out.println(c);

        // Mutant code: unreachable switch statement
        boolean unreachableSwitchCondition = false;
        switch (unreachableSwitchCondition) {
            case true:
                // Unreachable code
                System.out.println("This code will never be reached");
                break;
            case false:
                // Reachable code
                System.out.println("This code will always be reached");
                break;
            default:
                // Default case
                System.out.println("This is the default case");
                break;
        }
    }
}