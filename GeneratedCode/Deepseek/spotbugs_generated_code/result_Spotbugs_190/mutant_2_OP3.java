import java.util.ArrayList;
import java.util.List;

class BuggyList {
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
    public static final List<String> BUGGY_LIST = new ArrayList<>();

    public static void addToBuggyList(String item) {
        BUGGY_LIST.add(item);
        modifyListIfPossible();
    }

    public static List<String> showBug() {
        return BUGGY_LIST;
    }

    private static void modifyListIfPossible() {
        // Unreachable IF statement as per the Mutation Operator
        boolean condition = false;
        if (condition) {
            BUGGY_LIST.remove(0);
        }
    }
}