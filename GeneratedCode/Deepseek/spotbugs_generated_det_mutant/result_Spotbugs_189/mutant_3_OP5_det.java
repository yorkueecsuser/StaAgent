import java.util.*;

class BuggyCode {
    private static final List<String> BUGGY_LIST = new ArrayList<>();

    static {
        BUGGY_LIST.add("Initial content");
    }

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int wpmjzpzp = 0;switch  (wpmjzpzp) {case 1:char skvmhtfu = 'o';break;default:String kijaqkll = "tzysbvgd";break;}
        BUGGY_LIST.add("Malicious content"); // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)
    
}
}