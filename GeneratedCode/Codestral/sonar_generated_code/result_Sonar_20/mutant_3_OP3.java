import java.util.ArrayList;
import java.util.List;

class BuggyCollectionModification {
    public static boolean getFalseCondition() {
        return false;
    }

    public static void showBug() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("xanadu");
        list.add("orange");

        if (getFalseCondition()) {
            // Unreachable code
            System.out.println("This line will never be executed.");
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