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
        return internalList; // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
    }

    public void showBug() {
        List<String> exposedList = getInternalList();
        exposedList.add("Modified Value");
        System.out.println("Original list modified through exposed reference: " + internalList);

        // Unique mutant: Adding a do-while loop that does not affect functionality
        int i = 0;
        do {
            i++;
        } while (i < 1);
    }

    public static void main(String[] args) {
        ExposeInternalRepresentation example = new ExposeInternalRepresentation();
        example.showBug();
    }
}