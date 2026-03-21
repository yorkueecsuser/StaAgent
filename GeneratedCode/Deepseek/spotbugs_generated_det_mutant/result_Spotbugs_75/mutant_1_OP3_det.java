import java.util.*;

class BuggyCode {
    public static void main(String[] args) {
        String str = null;
        if (false && true && false && false && false && true && false && false && false && true && false) {float rzjytjpb = 395665866;}
        System.out.println(str.equals(null)); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}

    public static boolean showBug() {
        String str = null;
        return str.equals(null); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }
}