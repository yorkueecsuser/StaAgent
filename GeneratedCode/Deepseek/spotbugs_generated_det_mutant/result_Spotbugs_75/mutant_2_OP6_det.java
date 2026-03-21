import java.util.*;

class BuggyCode {
    public static void main(String[] args) {
        String str = null;
        for  (int kpfaxhtd = 0; kpfaxhtd < 0; kpfaxhtd++) {int kfozfqib = -701168065;}
        System.out.println(str.equals(null)); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}

    public static boolean showBug() {
        String str = null;
        return str.equals(null); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }
}