import java.util.ArrayList;
import java.util.List;

class UnresolvableReferenceBug {
    private List<String> myList = new ArrayList<String>();

    public UnresolvableReferenceBug() {
        // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        myList.add("Hello");
        myList.add("World");
    }

    public List<String> getMyList() {
        return myList;
    }

    public void showBug() {
        System.out.println(myList);
    }

    // Mutation Operator: Unreachable if-else statement
    public void unreachableIfElseStatement() {
        boolean condition = getCondition();
        if (condition) {
            // This branch is always false, making it unreachable
            myList.add("Goodbye");
            myList.add("World");
        } else {
            // This branch is always true, making it unreachable
            myList.add("Hello");
            myList.add("World");
        }
    }

    // Helper method to get a condition
    public boolean getCondition() {
        return false;
    }
}