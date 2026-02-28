import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        float c = a / b; // BUG: Math operands should be cast before assignment
        System.out.println(c);
        String d = "dead store"; // Dead store mutant
    }
}