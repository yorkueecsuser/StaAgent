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
        if (true && false && false && true && true && true && false && false && true && false && false) {int qtnnkspo = -833516061;}
        BUGGY_LIST.add("Malicious content"); // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)
    
}
}