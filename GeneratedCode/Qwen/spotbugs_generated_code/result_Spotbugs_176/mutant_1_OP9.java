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
        return internalList; // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP) 
    }

    public void showBug() {
        List<String> exposedList = getInternalList();
        exposedList.add("Modified Value");
        System.out.println("Original list modified through exposed reference: " + internalList);

        // Equivalent Loop Replacement: No loop in the original code, so adding a loop for demonstration
        int i = 0;
        do {
            System.out.println("Element at index " + i + ": " + internalList.get(i));
            i++;
        } while (i < internalList.size());

        // Equivalent Loop Replacement: Adding another loop for demonstration
        int j = 0;
        do {
            System.out.println("Another look at element at index " + j + ": " + internalList.get(j));
            j++;
        } while (j < internalList.size());
    }

    public static void main(String[] args) {
        ExposeInternalRepresentation example = new ExposeInternalRepresentation();
        example.showBug();
    }
}