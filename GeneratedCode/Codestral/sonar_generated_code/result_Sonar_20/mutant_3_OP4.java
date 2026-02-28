import java.util.ArrayList;
import java.util.List;

class BuggyCollectionModification {
    private static boolean getFalseCondition() {
        return false;
    }

    public static void showBug() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("xanadu");
        list.add("orange");

        for (String element : list) {
            if (element.startsWith("x")) {
                list.remove(element);
            }

            // Mutant code: Unreachable if-else statement
            boolean shouldRun = getFalseCondition();
            if (shouldRun) {
                System.out.println("This line is unreachable");
            } else {
                // This branch is unreachable
            }
        }

        System.out.println(list);
    }

    public static void main(String[] args) {
        showBug();
    }
}