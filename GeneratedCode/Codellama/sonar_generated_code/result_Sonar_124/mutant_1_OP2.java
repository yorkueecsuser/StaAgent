import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        float c = a / b; // BUG: Math operands should be cast before assignment
        float d = a / b; // Mutant: Duplicated assignment statement
        System.out.println(c);
        System.out.println(d);
    }
}