import java.util.ArrayList;
import java.util.List;

class CollectionModificationBug {

    public List<String> showBug(List<String> lst) {
        // Adding an unreachable while loop with a non-final condition
        boolean conditionWhile = getCondition(); 
        while (conditionWhile) {
            // This block is intentionally unreachable
            System.out.println("This is an unreachable block");
        }

        for (String element : lst) {
            if (element.startsWith("x")) {
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }
        return lst;
    }

    // A method to provide a non-final condition
    private boolean getCondition() {
        return false; // Ensures the while loop is unreachable
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