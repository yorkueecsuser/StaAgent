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
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This is a placeholder for potential future logic
            System.out.println("This is a placeholder logic.");
        } else {
            // Unreachable if-else branch
            System.out.println("This is an unreachable branch.");
        }
        return internalList; // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
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

    // Method to provide a dynamic condition for the if-else statement
    private boolean getCondition() {
        return false; // This will ensure the else block is unreachable
    }
}