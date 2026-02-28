import java.util.ArrayList;
import java.util.List;

class CollectionModificationBug {

    public List<String> showBug(List<String> lst) {
        for (String element : lst) {
            if (element.startsWith("x")) {
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }
        
        // Unreachable switch statement added
        int unreachableSwitchVariable = getUnreachableValue();
        switch (unreachableSwitchVariable) {
            case 1:
                System.out.println("This is unreachable code.");
                break;
            case 2:
                System.out.println("This will never execute.");
                break;
            default:
                break;
        }

        return lst;
    }

    // Method to simulate a non-final variable always returning a value making the switch unreachable
    private int getUnreachableValue() {
        return -1; // This ensures no case in the switch will ever match
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