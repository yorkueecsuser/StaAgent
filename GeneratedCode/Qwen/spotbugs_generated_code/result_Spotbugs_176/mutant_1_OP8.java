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
    }

    public static void main(String[] args) {
        ExposeInternalRepresentation example = new ExposeInternalRepresentation();
        example.showBug();
    }

    // Mutated code with renaming mutation operator
    private List<String> z;

    public ExposeInternalRepresentation(char x) {
        this.z = new ArrayList<>();
        this.z.add("Initial Value");
    }

    // Method that exposes the internal mutable object
    public List<String> y() {
        return z; // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP) 
    }

    public void a() {
        List<String> b = y();
        b.add("Modified Value");
        System.out.println("Original list modified through exposed reference: " + z);
    }

    public static void c(String[] d) {
        ExposeInternalRepresentation e = new ExposeInternalRepresentation('f');
        e.a();
    }
}