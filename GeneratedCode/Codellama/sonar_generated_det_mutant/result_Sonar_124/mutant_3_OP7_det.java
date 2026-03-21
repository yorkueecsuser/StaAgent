import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        boolean jweyxwpr = false;while (jweyxwpr && true && true && false && false && true && false && true && false && true && false && false) {double bxkfyfpd = 749381341;}
        float c = a / b; // BUG: Math operands should be cast before assignment
        System.out.println(c);
    
}
}