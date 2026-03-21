import java.util.ArrayList;
import java.util.List;

class BuggyList {
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
    public static final List<String> BUGGY_LIST = new ArrayList<>();

    // Mutation: Dead Store
    private static final String UNUSED_VARIABLE = "deadstore";

    public static void addToBuggyList(String item) {
        BUGGY_LIST.add(item);
    }

    public static List<String> showBug() {
        return BUGGY_LIST;
    }
}