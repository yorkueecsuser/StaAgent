import java.util.ArrayList;
import java.util.List;

class CollectionModificationBug {

    public List<String> showBug(List<String> lst) {
        for (String element : lst) {
            if (element.startsWith("x")) {
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }
            // Unreachable switch statement mutation
            int unreachableSwitchCondition = getUnreachableSwitchCondition();
            switch (unreachableSwitchCondition) {
                case 1000: // This case will never be reached
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
        }
        return lst;
    }

    // Method to simulate a condition for the unreachable switch statement
    private int getUnreachableSwitchCondition() {
        return -1; // Always returns -1, so the case 1000 will never be hit
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