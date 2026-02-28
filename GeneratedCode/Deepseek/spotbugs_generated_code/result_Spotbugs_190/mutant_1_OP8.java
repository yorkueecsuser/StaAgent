import java.util.ArrayList;
import java.util.List;

class BuggyList {
    public static final List<String> BUGGY_LIST = new ArrayList<>();

    public static void addToBuggyList(String item) {
        String renamedItem = item; // Mutant code: Renamed item to renamedItem for mutation
        BUGGY_LIST.add(renamedItem);
    }

    public static List<String> showBug() {
        return BUGGY_LIST;
    }
}