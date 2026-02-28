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

    // Mutant Code
    public List<String> showBugMutant(List<String> a) {
        for (String b : a) {
            if (b.startsWith("x")) {
                a.remove(b); // BUG: Collections should not be modified while they are iterated
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

        // Testing mutant method
        List<String> mutantResult = cmb.showBugMutant(items);
        System.out.println("After Mutant: " + mutantResult);
    }
}