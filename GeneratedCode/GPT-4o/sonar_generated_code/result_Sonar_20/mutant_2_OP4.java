import java.util.ArrayList;
import java.util.List;

class CollectionModificationBug {

    public List<String> showBug(List<String> lst) {
        // Unreachable if-else branch inserted
        boolean condition = getCondition(); // This method is introduced to ensure the branch is unreachable
        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This block is always executed.");
        }

        for (String element : lst) {
            if (element.startsWith("x")) {
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }
        return lst;
    }

    // Helper method to simulate a dynamically determined condition
    private boolean getCondition() {
        return false; // This makes the if block above unreachable
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