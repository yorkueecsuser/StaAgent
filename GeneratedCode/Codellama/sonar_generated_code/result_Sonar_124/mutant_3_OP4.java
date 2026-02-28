import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        float c = a / b; // BUG: Math operands should be cast before assignment
        System.out.println(c);

        // Unreachable if-else statement
        boolean condition = false;
        if (condition) {
            // This branch is unreachable
            System.out.println("This branch is unreachable");
        } else {
            // This branch is reachable
            System.out.println("This branch is reachable");
        }
    }
}