import java.util.ArrayList;
import java.util.List;

class CollectionModificationBug {

    public List<String> showBug(List<String> lst) {
        boolean unreachableCondition = getUnreachableCondition(); // Non-final variable
        if (unreachableCondition) {
            // This code block is unreachable because unreachableCondition is always false
            System.out.println("This branch is unreachable.");
        } else {
            for (String element : lst) {
                if (element.startsWith("x")) {
                    lst.remove(element); // BUG: Collections should not be modified while they are iterated
                }
            }
        }
        return lst;
    }

    public boolean getUnreachableCondition() {
        return false; // This returns false, ensuring the condition is unreachable
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