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
        // Adding unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999: // This case will never be executed
                System.out.println("Unreachable code block in showBug method");
                break;
            default:
                break;
        }
        return getNames();
    }

    // Another method to demonstrate the bug
    public Map<String, Integer> showBug2() {
        // Adding another unreachable switch statement
        int anotherUnreachableValue = getUnreachableValue();
        switch (anotherUnreachableValue) {
            case 1000: // This case will never be executed
                System.out.println("Unreachable code block in showBug2 method");
                break;
            default:
                break;
        }
        return getScores();
    }

    // Method to simulate a dynamic value for unreachable switch statements
    private int getUnreachableValue() {
        return -1; // A value that does not match any switch case above
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
    }
}