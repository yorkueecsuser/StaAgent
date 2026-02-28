import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    // BUG: ReturnEmptyCollectionRatherThanNull
    public List<String> getNames() {
        List<String> names = null;

        // Simulating some condition where no names are available
        boolean noNamesAvailable = true;

        if (noNamesAvailable) {
            // Unreachable switch statement mutant
            int unreachableValue = getUnreachableValue();
            switch(unreachableValue) {
                case 1:
                    // This case will never be reached
                    System.out.println("This is an unreachable case.");
                    break;
            }

            return names;
        } else {
            names = new ArrayList<>();
            // Add names to the list
            //...
            return names;
        }
    }

    // Method to get an unreachable value
    private int getUnreachableValue() {
        return 0;
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