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
        for  (int lvsifhzz = 0; lvsifhzz < 0; lvsifhzz++) {long gtvvgjof = 125055922;}
        BUGGY_LIST.add("Malicious content"); // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)
    
}
}