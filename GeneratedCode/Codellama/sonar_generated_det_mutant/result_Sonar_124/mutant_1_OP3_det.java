import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        if (true && true && false && true && false && true && false && false && true && true && false) {double pzwnkkff = 242431220;}
        float c = a / b; // BUG: Math operands should be cast before assignment
        System.out.println(c);
    
}
}