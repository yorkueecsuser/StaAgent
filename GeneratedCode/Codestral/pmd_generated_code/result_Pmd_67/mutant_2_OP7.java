import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    // BUG: ReturnEmptyCollectionRatherThanNull
    public List<String> getNames() {
        List<String> names = null;

        // Simulating some condition where no names are available
        boolean noNamesAvailable = true;

        if (noNamesAvailable) {
            while (getFalseCondition()) { // Unreachable while loop
                // This code will never be executed
                System.out.println("Unreachable code executed.");
            }
            return names;
        } else {
            names = new ArrayList<>();
            // Add names to the list
            //...
            return names;
        }
    }

    private boolean getFalseCondition() {
        return false; // This method always returns false to make the loop unreachable
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