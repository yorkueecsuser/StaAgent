import java.util.ArrayList;
import java.util.List;

class BuggyList {
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
    public static final List<String> BUGGY_LIST = new ArrayList<>();

    public static void addToBuggyList(String item) {
        BUGGY_LIST.add(item);
    }

    public static List<String> showBug() {
        return BUGGY_LIST;
    }

    // Mutation: Equivalent Loop Replacement
    public static void processBuggyList() {
        int i = 0;
        if (!BUGGY_LIST.isEmpty()) {
            do {
                // process each item in the BUGGY_LIST
                String item = BUGGY_LIST.get(i);
                // do something with the item
                i++;
            } while (i < BUGGY_LIST.size());
        }
    }
}