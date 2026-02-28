import java.util.ArrayList;
import java.util.List;

class BuggyCollectionModification {
    private static boolean isFalse() {
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

            // Mutant Code: Unreachable if statement
            if (isFalse()) {
                System.out.println("This line should be unreachable");
            }
        }

        System.out.println(list);
    }

    public static void main(String[] args) {
        showBug();
    }
}