import java.util.ArrayList;
import java.util.List;

class BuggyCollectionModification {
    public static void showBug() {
        String deadStore = "uselessVar"; // Dead store variable
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("xanadu");
        list.add("orange");

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