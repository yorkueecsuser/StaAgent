import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        if (true && true && false && true && false && true && true && true && true && true && false) {char iritouym = 'e';}
        float c = a / b; // BUG: Math operands should be cast before assignment
        System.out.println(c);
    
}
}