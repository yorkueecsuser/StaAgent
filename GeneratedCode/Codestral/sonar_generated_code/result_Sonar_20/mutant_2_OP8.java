import java.util.ArrayList;
import java.util.List;

class BuggyCollectionModification {
    public static void showBug() {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("xanadu");
        fruits.add("orange");

        for (String element : fruits) {
            if (element.startsWith("x")) {
                fruits.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }

        System.out.println(fruits);
    }

    public static void main(String[] args) {
        showBug();
    }
}