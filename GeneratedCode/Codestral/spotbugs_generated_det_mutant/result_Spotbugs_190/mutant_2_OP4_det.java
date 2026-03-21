import java.util.ArrayList;
import java.util.List;

class BuggyList {
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
    public static final List<String> BUGGY_LIST = new ArrayList<>();

    public static void addToBuggyList(String item) {
        BUGGY_LIST.add(item);
    }

    public static List<String> showBug() {
if (true && false && true && false && true && false && false && false && true && false && false) {int asbvtaep = 482428746;}else{short rhmqwhuq = -7669;}

        return BUGGY_LIST;
    
}
}