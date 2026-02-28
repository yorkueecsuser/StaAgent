import java.util.ArrayList;
import java.util.List;

class CollectionModificationBug {

    public List<String> showBug(List<String> lst) {
        boolean conditionFor = getFalseCondition(); // introduce a method to provide a false condition
        for (String element : lst) {
            // Unreachable for loop added based on the mutation operator description
            for (int i = 0; conditionFor; i++) {
                System.out.println("This loop is unreachable");
            }
            if (element.startsWith("x")) {
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }
        return lst;
    }

    private boolean getFalseCondition() {
        return false; // method returns false, making the loop condition always false
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