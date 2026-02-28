import java.util.List;
import java.util.Set;

class InterfaceComparisonBug {

    public boolean showBug(List<String> list, Set<String> set) {
        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                System.out.println("This is unreachable code.");
                break;
        }

        return list.equals(set); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement unreachable
        return false;
    }

    public static void main(String[] args) {
        InterfaceComparisonBug bugDemo = new InterfaceComparisonBug();
        List<String> myList = List.of("a", "b", "c");
        Set<String> mySet = Set.of("a", "b", "c");
        System.out.println(bugDemo.showBug(myList, mySet));
    }
}