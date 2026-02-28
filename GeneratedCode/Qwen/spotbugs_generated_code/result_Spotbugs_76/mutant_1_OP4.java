import java.util.List;
import java.util.Set;

class InterfaceComparisonBug {

    public boolean showBug(List<String> list, Set<String> set) {
        // Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is unreachable code.");
        } else {
            // Alternative unreachable code
            System.out.println("This is also unreachable code.");
        }

        return list.equals(set); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }

    private boolean getCondition() {
        // This method returns a condition that is always false
        return false;
    }

    public static void main(String[] args) {
        InterfaceComparisonBug bugDemo = new InterfaceComparisonBug();
        List<String> myList = List.of("a", "b", "c");
        Set<String> mySet = Set.of("a", "b", "c");
        System.out.println(bugDemo.showBug(myList, mySet));
    }
}