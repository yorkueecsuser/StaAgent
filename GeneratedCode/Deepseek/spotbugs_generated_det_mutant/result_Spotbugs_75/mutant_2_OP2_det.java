import java.util.*;

class BuggyCode {
public static void main(String [] args){
    String str = null;
    str = null;
    System.out.println(str.equals(null));
}

    public static boolean showBug() {
        String str = null;
        return str.equals(null); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }
}