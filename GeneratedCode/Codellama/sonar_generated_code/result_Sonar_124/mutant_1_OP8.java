import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        float c = a / b; // BUG: Math operands should be cast before assignment
        System.out.println(c);
    }
}

// Renaming mutation
class BuggyMath {
    public static void main(String[] args) {
        int x = 2, y = 3;
        float z = x / y; // BUG: Math operands should be cast before assignment
        System.out.println(z);
    }
}