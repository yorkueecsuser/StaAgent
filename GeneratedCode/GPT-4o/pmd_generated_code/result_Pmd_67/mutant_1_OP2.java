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
        List<String> safeNames = new ArrayList<>();
        safeNames = new ArrayList<>(); // Duplicate assignment statement
        return safeNames;
    }

    // Corrected method without the bug for comparison
    public Map<String, Integer> getSafeScores() {
        Map<String, Integer> safeScores = new HashMap<>();
        safeScores = new HashMap<>(); // Duplicate assignment statement
        return safeScores;
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
}