import java.util.ArrayList;
import java.util.List;

class BuggyCollectionModification {
    private static boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public static void showBug() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("xanadu");
        list.add("orange");

        // Unreachable for loop
        for (int i = 0; getCondition(); i++) {
            System.out.println("This is an unreachable loop");
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