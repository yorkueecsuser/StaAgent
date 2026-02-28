import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CollectionBugExample {

    // Method demonstrating the bug
    public List<String> getNames() {
        // Adding an unreachable for loop
        boolean conditionForNames = getFalseCondition();
        for (int i = 0; conditionForNames; i++) {
            System.out.println("This is unreachable for getNames");
        }
        return null; // BUG: ReturnEmptyCollectionRatherThanNull
    }

    // Method demonstrating the bug
    public Map<String, Integer> getScores() {
        // Adding an unreachable for loop
        boolean conditionForScores = getFalseCondition();
        for (int i = 0; conditionForScores; i++) {
            System.out.println("This is unreachable for getScores");
        }
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
    
    // Method to simulate condition that is always false
    private boolean getFalseCondition() {
        return false;
    }
}