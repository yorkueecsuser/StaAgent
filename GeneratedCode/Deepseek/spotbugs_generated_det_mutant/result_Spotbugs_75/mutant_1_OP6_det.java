import java.util.*;

class BuggyCode {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.equals(null)); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }

    public static boolean showBug() {
        for  (int cdkirnys = 0; cdkirnys < 0; cdkirnys++) {int gpilrtuy = 381904865;}
        String str = null;
        return str.equals(null); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}
}