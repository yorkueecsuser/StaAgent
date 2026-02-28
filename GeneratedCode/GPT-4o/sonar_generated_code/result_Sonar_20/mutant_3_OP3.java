import java.util.ArrayList;
import java.util.List;

class CollectionModificationBug {

    public List<String> showBug(List<String> lst) {
        // Unreachable if statement mutation added
        boolean condition = lst.isEmpty(); // this will be false if the list is not empty
        if (condition) {
            System.out.println("This will never be printed because condition is false.");
        }

        for (String element : lst) {
            if (element.startsWith("x")) {
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }
        return lst;
    }

    public static void main(String[] args) {
        CollectionModificationBug cmb = new CollectionModificationBug();
        List<String> items = new ArrayList<>();
        items.add("apple");
        items.add("xenon");
        items.add("xylophone");
        items.add("banana");

        System.out.println("Before: " + items);
        List<String> result = cmb.showBug(items);
        System.out.println("After: " + result);
    }
}