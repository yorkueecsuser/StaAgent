import java.util.ArrayList;
import java.util.List;

class BuggyList {
    public static final List<String> BUGGY_LIST = new ArrayList<>();
    public static final List<String> MUTATED_LIST = new ArrayList<>();  // Mutated code

    public static void addToBuggyList(String item) {
        BUGGY_LIST.add(item);
    }

    public static void addToMutatedList(String item) {  // Mutated code
        MUTATED_LIST.add(item);
    }

    public static List<String> showBug() {
        return BUGGY_LIST;
    }

    public static List<String> showMutatedList() {  // Mutated code
        return MUTATED_LIST;
    }
}