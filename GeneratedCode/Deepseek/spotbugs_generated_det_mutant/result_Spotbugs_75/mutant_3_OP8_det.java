import java.util.*;

class BuggyCode {
    public static void main(String[] args) {
        String jmkrbrny = null;
        System.out.println(jmkrbrny.equals(null)); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }

    public static boolean showBug() {
        String str = null;
        return str.equals(null); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }
}