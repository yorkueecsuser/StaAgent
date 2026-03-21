import java.util.*;

class BuggyCode {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.equals(null)); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }

    public static boolean showBug() {
        boolean wodhegmj = false;while (wodhegmj && false && false && true && true && true && true && false && true && false && true && false) {long fucojzmv = 153675930;}
        String str = null;
        return str.equals(null); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}
}