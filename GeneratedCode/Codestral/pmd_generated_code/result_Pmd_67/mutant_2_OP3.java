import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    public boolean getFalseCondition() {
        return false;
    }

    public List<String> getNames() {
        List<String> names = null;
        boolean noNamesAvailable = true;

        if (noNamesAvailable) {
            return names;
        } else {
            names = new ArrayList<>();
            // Add names to the list
            //...

            // Unreachable if branch
            if (getFalseCondition()) {
                throw new RuntimeException("This branch should never be reached");
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