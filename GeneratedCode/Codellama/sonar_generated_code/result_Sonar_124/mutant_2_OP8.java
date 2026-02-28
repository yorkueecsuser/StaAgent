import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        float c = a / b; // BUG: Math operands should be cast before assignment
        System.out.println(c);
    }
}
// Renaming mutant
class BuggyMath {
    public static void main(String[] args) {
        int d = 2, e = 3;
        float f = d / e; // BUG: Math operands should be cast before assignment
        System.out.println(f);
    }
}