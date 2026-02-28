import java.util.List;
import java.util.Set;

class InterfaceComparisonBug {

    public boolean showBug(List<String> list, Set<String> set) {
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            System.out.println("This is an unreachable statement.");
        }
        return list.equals(set); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        InterfaceComparisonBug bugDemo = new InterfaceComparisonBug();
        List<String> myList = List.of("a", "b", "c");
        Set<String> mySet = Set.of("a", "b", "c");
        System.out.println(bugDemo.showBug(myList, mySet));
    }
}