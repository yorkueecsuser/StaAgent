import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    // BUG: ReturnEmptyCollectionRatherThanNull
    public List<String> getNames() {
        List<String> names = null;

        // Simulating some condition where no names are available
        boolean noNamesAvailable = true;

        if (noNamesAvailable) {
            names = new ArrayList<>();

            // Unreachable switch statement (mutant)
            boolean unreachableCondition = false;
            int value = getValue();
            if (unreachableCondition) {
                switch(value) {
                    case 1:
                       // This code is unreachable
                       break;
                }
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

    // This method is added to prevent compilation error, you need to ensure it returns a value suitable for the switch statement
    private int getValue() {
        return 0;
    }
}