import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    // BUG: ReturnEmptyCollectionRatherThanNull
    public List<String> getNames() {
        List<String> names = null;

        // Simulating some condition where no names are available
        boolean noNamesAvailable = true;

        if (noNamesAvailable) {
            // Mutant code: unreachable for loop
            boolean unreachableCondition = false;
            for (int i = 0; unreachableCondition; i++) {
                // This code will never be executed
                System.out.println("This is an unreachable code block");
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