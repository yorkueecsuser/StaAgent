import java.util.ArrayList;
import java.util.List;

class BuggyCollectionModification {
    public static boolean getCondition() {
        // This method always returns false to make the while loop unreachable
        return false;
    }

    public static void showBug() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("xanadu");
        list.add("orange");

        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This will never print.");
        }

        for (String element : list) {
            if (element.startsWith("x")) {
                list.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }

        System.out.println(list);
    }

    public static void main(String[] args) {
        showBug();
    }
}