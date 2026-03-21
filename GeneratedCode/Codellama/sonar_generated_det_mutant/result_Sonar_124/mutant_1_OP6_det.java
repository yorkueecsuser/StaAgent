import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        for  (int tfbvqdjb = 0; tfbvqdjb < 0; tfbvqdjb++) {byte lezvixor = 54;}
        float c = a / b; // BUG: Math operands should be cast before assignment
        System.out.println(c);
    
}
}