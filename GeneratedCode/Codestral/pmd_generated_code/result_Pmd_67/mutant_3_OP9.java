import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    // Mutated code with the "ReturnEmptyCollectionRatherThanNull" bug
    public List<String> getNames() {
        List<String> names = new ArrayList<>();  // Initialize names with an empty ArrayList

        // Simulating some condition where no names are available
        boolean noNamesAvailable = true;

        if (noNamesAvailable) {
            return names;  // Return empty list instead of null
        } else {
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
            System.out.println("Names list is null!");  // This line should not be executed
        }
    }
}