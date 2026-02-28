import java.util.ArrayList;
import java.util.List;

class BuggyList {
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
    public static final List<String> BUGGY_LIST = new ArrayList<>();
    public static final List<String> DUPLICATE_BUGGY_LIST = new ArrayList<>();

    public static void addToBuggyList(String item) {
        BUGGY_LIST.add(item);
        DUPLICATE_BUGGY_LIST.add(item);
    }

    public static List<String> showBug() {
        return BUGGY_LIST;
    }

    public static List<String> showDuplicateBug() {
        return DUPLICATE_BUGGY_LIST;
    }
}