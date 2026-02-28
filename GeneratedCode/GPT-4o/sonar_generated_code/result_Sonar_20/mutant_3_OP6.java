import java.util.ArrayList;
import java.util.List;

class CollectionModificationBug {

    public List<String> showBug(List<String> lst) {
        // Unreachable for loop
        boolean conditionFor = getCondition(); 
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable.");
        }

        for (String element : lst) {
            if (element.startsWith("x")) {
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }
        return lst;
    }

    private boolean getCondition() {
        return false; // This ensures the loop is unreachable
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