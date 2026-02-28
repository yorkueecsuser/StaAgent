import java.util.ArrayList;
import java.util.List;

class BuggyList {
    public static final List<String> BUGGY_LIST = new ArrayList<>();
    // Mutant code: Duplicate assignment statement
    public static final List<String> MUTANT_LIST = BUGGY_LIST;

    public static void addToBuggyList(String item) {
        BUGGY_LIST.add(item);
        // Mutant code: Add to the duplicate list
        MUTANT_LIST.add(item);
    }

    public static List<String> showBug() {
        return BUGGY_LIST;
    }

    // Mutant code: Add a new method to show mutant list
    public static List<String> showMutantList() {
        return MUTANT_LIST;
    }
}