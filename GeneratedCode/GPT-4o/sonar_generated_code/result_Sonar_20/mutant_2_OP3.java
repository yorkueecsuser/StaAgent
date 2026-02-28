import java.util.ArrayList;
import java.util.List;

class CollectionModificationBug {

    public List<String> showBug(List<String> lst) {
        boolean unreachableCondition = getCondition();  // Non-final variable to create an unreachable if branch
        for (String element : lst) {
            if (unreachableCondition) {
                // This block is unreachable because unreachableCondition is always false
                System.out.println("This will never be printed.");
            }
            if (element.startsWith("x")) {
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }
        return lst;
    }

    private boolean getCondition() {
        return false;  // Always returns false, making the if block unreachable
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