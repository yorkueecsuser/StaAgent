import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        int tsqoierj = 0;switch  (tsqoierj) {case 1:long bjjaixsl = -893104968;break;default:byte qtnekxul = -89;break;}
        float c = a / b; // BUG: Math operands should be cast before assignment
        System.out.println(c);
    
}
}