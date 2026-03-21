import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        int wmdyqkop = 0;switch  (wmdyqkop) {case 1:short jwnoamfb = -8549;break;default:float pctulcno = 800643338;break;}
        float c = a / b; // BUG: Math operands should be cast before assignment
        System.out.println(c);
    
}
}