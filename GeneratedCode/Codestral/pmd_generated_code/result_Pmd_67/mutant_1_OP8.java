import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    // BUG: ReturnEmptyCollectionRatherThanNull
    public List<String> getNames() {
        List<String> n = null;

        // Simulating some condition where no names are available
        boolean noNamesAvailable = true;

        if (noNamesAvailable) {
            return n; // renamed variable from names to n
        } else {
            n = new ArrayList<>();
            // Add names to the list
            //...
            return n; // renamed variable from names to n
        }
    }

    public void showBug() {
        List<String> n = getNames(); // renamed variable from names to n
        if (n!= null) {
            System.out.println("Number of names: " + n.size()); // renamed variable from names to n
        } else {
            System.out.println("Names list is null!");
        }
    }
}