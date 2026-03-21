import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        if (true && false && false && false && false && false && true && true && false && false && false) {int vocscboo = -393587575;}else{int riprywzp = 30855674;}
        float c = a / b; // BUG: Math operands should be cast before assignment
        System.out.println(c);
    
}
}