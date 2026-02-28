import java.util.ArrayList;
import java.util.List;

class BuggyList {
    public static final List<String> BUGGY_LIST = new ArrayList<>();

    public static void addToBuggyList(String item) {
        BUGGY_LIST.add(item);
    }

    public static List<String> showBug() {
        return BUGGY_LIST;
    }

    public static void printBuggyList() {
        int i = 0;
        do {
            System.out.println(BUGGY_LIST.get(i));
            i++;
        } while (i < BUGGY_LIST.size());
    }
}