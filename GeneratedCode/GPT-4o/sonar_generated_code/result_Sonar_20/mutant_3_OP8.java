import java.util.ArrayList;
import java.util.List;

class CollectionModificationBug {

    public List<String> showBug(List<String> lst) {
        for (String element : lst) {
            if (element.startsWith("x")) {
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }
        return lst;
    }

    public List<String> showBugMutant(List<String> a) { // Mutated method with renamed parameter
        for (String element : a) {
            if (element.startsWith("x")) {
                a.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }
        return a;
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

        // Demonstrating mutant method
        items.clear();
        items.add("apple");
        items.add("xenon");
        items.add("xylophone");
        items.add("banana");

        System.out.println("Before (Mutant): " + items);
        List<String> resultMutant = cmb.showBugMutant(items);
        System.out.println("After (Mutant): " + resultMutant);
    }
}