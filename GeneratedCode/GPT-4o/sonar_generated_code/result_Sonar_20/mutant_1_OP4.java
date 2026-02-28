import java.util.ArrayList;
import java.util.List;

class CollectionModificationBug {

    public List<String> showBug(List<String> lst) {
        boolean condition = getFalseCondition(); // get a false condition to make the if statement unreachable
        if (condition) {
            System.out.println("This block is unreachable");
        } else {
            for (String element : lst) {
                if (element.startsWith("x")) {
                    lst.remove(element); // BUG: Collections should not be modified while they are iterated
                }
            }
        }
        return lst;
    }

    private boolean getFalseCondition() {
        return false;
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