import java.util.ArrayList;
import java.util.List;

class BuggyCollectionModification {
    public static void showBug() {
        List<String> a = new ArrayList<>();
        a.add("apple");
        a.add("banana");
        a.add("xanadu");
        a.add("orange");

        for (String b : a) {
            if (b.startsWith("x")) {
                a.remove(b); // BUG: Collections should not be modified while they are iterated
            }
        }

        System.out.println(a);
    }

    public static void main(String[] args) {
        showBug();
    }
}