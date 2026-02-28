import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    public List<String> getNames() {
        List<String> names = null;
        boolean noNamesAvailable = true;

        if (noNamesAvailable) {
            String deadStore = "unusedVar"; // This is the added dead store
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