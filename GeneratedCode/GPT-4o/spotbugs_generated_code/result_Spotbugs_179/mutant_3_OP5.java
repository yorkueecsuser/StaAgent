import java.util.ArrayList;
import java.util.List;

class ExposeInternalState {
    private static List<String> internalList = new ArrayList<>(); // BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)

    public static void initializeList(List<String> externalList) {
        internalList = externalList; // BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)

        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 9999: // This case will never be reached
                System.out.println("Unreachable code");
                break;
        }
    }

    public static int getUnreachableValue() {
        return -1; // Ensures the switch case is never reached
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