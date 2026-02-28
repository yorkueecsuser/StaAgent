import java.util.ArrayList;
import java.util.List;

class BugDemonstration {

    public boolean showBug() {
        List<String> logs = new ArrayList<>();
        // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        return logs.stream().allMatch(e -> e.contains("error")); // Noncompliant, this test passes if logs are empty!
    }

    public static void main(String[] args) {
        BugDemonstration bugDemo = new BugDemonstration();
        System.out.println(bugDemo.showBug()); // This will print true even when the list is empty
    }
}