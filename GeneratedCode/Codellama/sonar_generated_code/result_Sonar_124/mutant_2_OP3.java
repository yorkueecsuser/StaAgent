import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        float c = a / b; // BUG: Math operands should be cast before assignment

        // Unreachable if statement mutation
        if (false) {
            System.out.println("This statement is unreachable.");
        } else {
            System.out.println(c);
        }
    }
}