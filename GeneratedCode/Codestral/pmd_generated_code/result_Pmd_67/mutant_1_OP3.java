import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    // BUG: ReturnEmptyCollectionRatherThanNull
    public List<String> getNames() {
        List<String> names = null;

        // Simulating some condition where no names are available
        boolean noNamesAvailable = true;

        if (noNamesAvailable) {
            // Inserted unreachable if statement
            if (getUnreachableCondition()) {
                System.out.println("This line should never execute.");
            }
            return names;
        } else {
            names = new ArrayList<>();
            // Add names to the list
            //...
            return names;
        }
    }

    // Method that always returns false to make the if statement unreachable
    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        List<String> names = getNames();
        if (names!= null) {
            System.out.println("Number of names: " + names.size());
        } else {
            System.out.println("Names list is null!");
        }
    }
}