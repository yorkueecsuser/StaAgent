import java.util.ArrayList;
import java.util.List;

class BuggyCollectionModification {
    public static boolean getUnreachableCondition() {
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
                list.remove(element); // BUG: Collections should not be modified while they are iterated
            }

            // Mutation: Unreachable if-else statement
            if (getUnreachableCondition()) {
                System.out.println("This line should never be printed.");
            } else {
                // This else block is unreachable because the condition is always false.
                System.out.println("This line is unreachable.");
            }
        }

        System.out.println(list);
    }

    public static void main(String[] args) {
        showBug();
    }
}