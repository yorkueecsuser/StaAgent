import java.util.ArrayList;
import java.util.List;

class ExposeInternalRepresentation {

    private List<String> internalList;

    public ExposeInternalRepresentation() {
        this.internalList = new ArrayList<>();
        this.internalList.add("Initial Value");
        this.internalList = new ArrayList<>(); // Mutant: Duplicated assignment statement
    }

    // Method that exposes the internal mutable object
    public List<String> getInternalList() {
        return internalList; // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
        return internalList; // Mutant: Duplicated assignment statement
    }

    public void showBug() {
        List<String> exposedList = getInternalList();
        exposedList.add("Modified Value");
        System.out.println("Original list modified through exposed reference: " + internalList);
        List<String> anotherExposedList = getInternalList(); // Mutant: Duplicated assignment statement
    }

    public static void main(String[] args) {
        ExposeInternalRepresentation example = new ExposeInternalRepresentation();
        example.showBug();
        ExposeInternalRepresentation anotherExample = new ExposeInternalRepresentation(); // Mutant: Duplicated assignment statement
    }
}