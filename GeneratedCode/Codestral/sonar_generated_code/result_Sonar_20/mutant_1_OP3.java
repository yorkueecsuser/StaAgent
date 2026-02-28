import java.util.ArrayList;
import java.util.List;

class BuggyCollectionModification {
    private static boolean unreachableCondition() {
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
            if (unreachableCondition()) {
                // Unreachable block: This if statement is always false, making this block unreachable.
                System.out.println("This line is unreachable");
            }
        }

        System.out.println(list);
    }

    public static void main(String[] args) {
        showBug();
    }
}