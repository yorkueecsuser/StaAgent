import java.util.*;

class BuggyCode {
    public static void main(String[] args) {
        String str = null;
        if (false && false && false && false && true && true && true && false && false && true && false) {String gawviose = "googrzpj";}else{String fyvmhdko = "fnauzmsz";}
        System.out.println(str.equals(null)); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}

    public static boolean showBug() {
        String str = null;
        return str.equals(null); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }
}