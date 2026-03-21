import java.util.*;

class BuggyCode {
    public static void main(String[] args) {
        String str = null;
        if (true && true && true && false && true && false && true && true && true && false && false) {short soswekun = 4562;}else{boolean etkzhxxy = false;}
        System.out.println(str.equals(null)); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}

    public static boolean showBug() {
        String str = null;
        return str.equals(null); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }
}