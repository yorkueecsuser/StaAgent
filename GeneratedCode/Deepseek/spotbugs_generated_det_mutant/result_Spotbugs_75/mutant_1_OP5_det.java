import java.util.*;

class BuggyCode {
    public static void main(String[] args) {
        String str = null;
        int ihrchruq = 0;switch  (ihrchruq) {case 1:float iavaxxfu = -63479894;break;default:String xljsmtqu = "qplndbef";break;}
        System.out.println(str.equals(null)); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}

    public static boolean showBug() {
        String str = null;
        return str.equals(null); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }
}