import java.util.ArrayList;
import java.util.List;

class ExposeInternalRepresentation {

    private List<String> internalList;

    public ExposeInternalRepresentation() {
        this.internalList = new ArrayList<>();
        this.internalList.add("Initial Value");
    }

    // Method that exposes the internal mutable object
    public List<String> getInternalList() {
        boolean shouldRun = getCondition(); // Dynamically determined condition
        if (shouldRun) {
            // Some code that does not affect the bug
            System.out.println("This is a reachable if block.");
        } else {
            // Unreachable if-else branch
            System.out.println("This is an unreachable else block.");
        }
        return internalList; // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
    }

    private boolean getCondition() {
        // This method returns a condition that is always false, making the else block unreachable
        return false;
    }

    public void showBug() {
        List<String> exposedList = getInternalList();
        exposedList.add("Modified Value");
        System.out.println("Original list modified through exposed reference: " + internalList);
    }

    public static void main(String[] args) {
        ExposeInternalRepresentation example = new ExposeInternalRepresentation();
        example.showBug();
    }
}