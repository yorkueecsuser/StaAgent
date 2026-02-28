import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        float c = a / b; // BUG: Math operands should be cast before assignment

        // Unreachable while loop
        while (false) {
            System.out.println("This code is unreachable");
        }

        System.out.println(c);
    }
}