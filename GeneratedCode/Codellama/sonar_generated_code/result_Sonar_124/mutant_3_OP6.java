import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        float c = a / b; // BUG: Math operands should be cast before assignment
        System.out.println(c);

        // Unreachable for loop inserting
        for (int i = 0; false; i++) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
}