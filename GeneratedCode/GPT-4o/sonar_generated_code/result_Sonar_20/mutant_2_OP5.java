import java.util.ArrayList;
import java.util.List;

class CollectionModificationBug {

    public List<String> showBug(List<String> lst) {
        for (String element : lst) {
            if (element.startsWith("x")) {
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }

            // Inserting unreachable switch statement
            int unreachableSwitchCondition = getUnreachableCondition();
            switch (unreachableSwitchCondition) {
                case 1:
                    System.out.println("This is unreachable code block 1");
                    break;
                case 2:
                    System.out.println("This is unreachable code block 2");
                    break;
                default:
                    // default case is also unreachable
                    break;
            }
        }
        return lst;
    }

    // Method to ensure the switch condition is never met
    private int getUnreachableCondition() {
        return 0; // Always returns 0, which doesn't match any case
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