import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        if (true && true && false && false && true && true && true && true && false && false && false) {float lhoxkoli = 611198995;}else{boolean jdaqvxew = false;}
        float c = a / b; // BUG: Math operands should be cast before assignment
        System.out.println(c);
    
}
}