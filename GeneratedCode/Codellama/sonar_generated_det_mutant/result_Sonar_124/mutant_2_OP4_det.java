import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        if (false && false && true && true && true && false && true && true && false && false && false) {double ytpjyibq = 861083867;}else{short dozmymvf = -4149;}
        float c = a / b; // BUG: Math operands should be cast before assignment
        System.out.println(c);
    
}
}