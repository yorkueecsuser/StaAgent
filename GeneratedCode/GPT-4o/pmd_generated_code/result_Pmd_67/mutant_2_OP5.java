import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CollectionBugExample {

    // Method demonstrating the bug
    public List<String> getNames() {
        return null; // BUG: ReturnEmptyCollectionRatherThanNull
    }

    // Method demonstrating the bug
    public Map<String, Integer> getScores() {
        return null; // BUG: ReturnEmptyCollectionRatherThanNull
    }

    // Corrected method without the bug for comparison
    public List<String> getSafeNames() {
        return new ArrayList<>();
    }

    // Corrected method without the bug for comparison
    public Map<String, Integer> getSafeScores() {
        return new HashMap<>();
    }

    // Method to demonstrate the bug
    public Collection<String> showBug() {
        return getNames();
    }

    // Another method to demonstrate the bug
    public Map<String, Integer> showBug2() {
        return getScores();
    }

    // Method that provides a condition for switch statement
    public int getUnreachableSwitchValue() {
        return -1; // This value will not match any case
    }

    public static void main(String[] args) {
        CollectionBugExample example = new CollectionBugExample();
        Collection<String> names = example.showBug();
        if (names != null) {
            System.out.println("Names collection is not null");
        } else {
            System.out.println("Names collection is null");
        }

        Map<String, Integer> scores = example.showBug2();
        if (scores != null) {
            System.out.println("Scores map is not null");
        } else {
            System.out.println("Scores map is null");
        }

        // Inserted unreachable switch statement
        int unreachableValue = example.getUnreachableSwitchValue();
        switch (unreachableValue) {
            case 0:
                System.out.println("This is unreachable case 0");
                break;
            case 1:
                System.out.println("This is unreachable case 1");
                break;
            default:
                // No action needed, default acts as a catch-all
                break;
        }
    }
}