import java.util.ArrayList;
import java.util.List;

class BuggyCollectionModification {
    private static boolean getFalseCondition() {
        // This method always returns false to make the if-else statement unreachable
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

            // Inserting the unreachable if-else statement
            if (getFalseCondition()) {
                // This block will never be executed
                System.out.println("Unreachable code");
            } else {
                // This is the reachable else block
                System.out.println("Reachable code");
            }
        }

        System.out.println(list);
    }

    public static void main(String[] args) {
        showBug();
    }
}