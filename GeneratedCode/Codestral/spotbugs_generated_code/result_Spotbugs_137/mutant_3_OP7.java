import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Example");

        // Mutation: Unreachable while loop
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            System.out.println("This code will never be executed");
        }

        return stringCollection.contains(str);
    }

    // Dummy method to provide condition for the while loop
    private boolean getCondition() {
        return false;
    }
}