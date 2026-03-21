import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        boolean ejgobhuy = false;while (ejgobhuy && false && true && true && false && false && false && true && true && true && true && false) {short cerdkjzm = -5291;}
        float c = a / b; // BUG: Math operands should be cast before assignment
        System.out.println(c);
    
}
}