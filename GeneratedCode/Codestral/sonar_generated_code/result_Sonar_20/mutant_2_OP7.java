import java.util.ArrayList;
import java.util.List;

class BuggyCollectionModification {
    public static boolean getCondition() {
        return false;
    }

    public static void showBug() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("xanadu");
        list.add("orange");

        // Mutation Operator: Unreachable while loop
        while (getCondition()) {
            // This code will never execute
            System.out.println("This is an unreachable loop.");
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