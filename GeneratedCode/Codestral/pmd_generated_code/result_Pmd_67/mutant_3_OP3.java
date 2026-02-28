import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    // BUG: ReturnEmptyCollectionRatherThanNull
    public List<String> getNames() {
        List<String> names = null;

        // Simulating some condition where no names are available
        boolean noNamesAvailable = true;

        if (noNamesAvailable) {
            return names;
        } else {
            names = new ArrayList<>();
            // Add names to the list
            //...

            // Unreachable if statement mutation
            boolean alwaysFalse = false;
            if (alwaysFalse) {
                // This code is unreachable
                throw new RuntimeException("This code should not be executed!");
            }

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