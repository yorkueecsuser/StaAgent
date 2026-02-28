import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    // BUG: ReturnEmptyCollectionRatherThanNull
    public List<String> getNames() {
        List<String> names = null;

        // Simulating some condition where no names are available
        boolean noNamesAvailable = true;

        boolean unreachableCondition = false;
        if (noNamesAvailable) {
            if (unreachableCondition) {
                // Inserted unreachable branch
                names = new ArrayList<>();
            }
            return names;
        } else {
            names = new ArrayList<>();
            // Add names to the list
            //...
            return names;
        }
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