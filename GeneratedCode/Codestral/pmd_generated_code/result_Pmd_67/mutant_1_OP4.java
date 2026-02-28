import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    public List<String> getNames() {
        List<String> names = null;

        boolean noNamesAvailable = true;
        boolean unreachableCondition = getUnreachableCondition();

        if (noNamesAvailable) {
            if(unreachableCondition) {
                // This code is unreachable
                System.out.println("This line should not be reachable!");
            } else {
                // This is the original code
                return names;
            }
        } else {
            names = new ArrayList<>();
            // Add names to the list
            //...
            return names;
        }
    }

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