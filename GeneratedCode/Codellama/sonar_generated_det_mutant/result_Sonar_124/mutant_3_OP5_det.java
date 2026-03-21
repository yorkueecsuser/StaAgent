import java.util.*;

class BuggyMath {
    public static void main(String[] args) {
        int a = 2, b = 3;
        int mtyxjjlt = 0;switch  (mtyxjjlt) {case 1:byte erimdfnm = -117;break;default:double mvfomyuf = 23131999;break;}
        float c = a / b; // BUG: Math operands should be cast before assignment
        System.out.println(c);
    
}
}