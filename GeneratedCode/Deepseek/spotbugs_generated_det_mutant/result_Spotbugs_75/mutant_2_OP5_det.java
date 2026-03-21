import java.util.*;

class BuggyCode {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.equals(null)); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }

    public static boolean showBug() {
        int udwsrcna = 0;switch  (udwsrcna) {case 1:short ilzictsg = -6076;break;default:short nzjpnxne = 1136;break;}
        String str = null;
        return str.equals(null); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}
}