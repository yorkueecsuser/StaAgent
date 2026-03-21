import java.util.ArrayList;
import java.util.List;

class BuggyList {
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
    public static final List<String> BUGGY_LIST = new ArrayList<>();

    public static void addToBuggyList(String item) {
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This case is unreachable
                break;
        }
        BUGGY_LIST.add(item);
    }

    private static int getUnreachableValue() {
        // This method always returns a value that is not 1
        return 2;
    }

    public static List<String> showBug() {
        return BUGGY_LIST;
    }
}