import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        for  (int kugjbwdn = 0; kugjbwdn < 0; kugjbwdn++) {boolean ciowgovo = false;}
        float c = a / b; // BUG: Math operands should be cast before assignment
        System.out.println(c);
    
}
}