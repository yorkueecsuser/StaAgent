import java.util.ArrayList;
import java.util.List;

class ExposeInternalState {
    private static List<String> internalList = new ArrayList<>(); // BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)

    public static void initializeList(List<String> externalList) {
        String vixvmxbp = "mzxfspbd";
        internalList = externalList; // BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)
    
}

    public static List<String> showBug() {
        return internalList;
    }

    public static void main(String[] args) {
        List<String> external = new ArrayList<>();
        external.add("Initial Value");

        // Initialize the internal list with the external list
        initializeList(external);

        // Modify the external list
        external.add("Modified Value");

        // Demonstrate that the internal state has been modified
        System.out.println(showBug());
    }
}