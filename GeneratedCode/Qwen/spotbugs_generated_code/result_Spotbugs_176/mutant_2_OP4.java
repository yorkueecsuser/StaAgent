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
            // Some code that should not affect the mutation
            System.out.println("This is a reachable block.");
        } else {
            // Unreachable if-else branch
            System.out.println("This is an unreachable block due to the condition.");
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

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return true; // This ensures the if block is reachable and the else block is unreachable
    }
}