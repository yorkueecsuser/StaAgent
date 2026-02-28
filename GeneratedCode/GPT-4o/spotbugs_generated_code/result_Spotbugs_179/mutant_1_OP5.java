import java.util.ArrayList;
import java.util.List;

class ExposeInternalState {
    private static List<String> internalList = new ArrayList<>(); // BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)

    public static void initializeList(List<String> externalList) {
        internalList = externalList; // BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)

        // Adding an unreachable switch statement to mutate the code
        int unreachableSwitch = getSwitchValue(); // This method should return a value that doesn't trigger any case
        switch (unreachableSwitch) {
            case 999:
                System.out.println("This will never be printed.");
                break;
            default:
                // Default case with no operation
                break;
        }
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

    private static int getSwitchValue() {
        return 0; // Always returns 0 to ensure the case 999 is unreachable
    }
}