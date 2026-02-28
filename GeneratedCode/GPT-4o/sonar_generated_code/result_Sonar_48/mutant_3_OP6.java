import java.util.List;
import java.util.ArrayList;

class LogAssertions {

    public boolean showBug(List<String> logs) {
        // Noncompliant code example
        boolean allMatchResult = logs.stream().allMatch(e -> e.contains("error")); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        boolean doesNotContainResult = !logs.contains("error"); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This for loop is unreachable");
        }

        return allMatchResult && doesNotContainResult;
    }

    // Method to ensure dynamic condition for the unreachable for loop
    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        LogAssertions logAssertions = new LogAssertions();
        List<String> logs = new ArrayList<>(); // An empty list
        boolean result = logAssertions.showBug(logs);
        System.out.println("Bug demonstration result: " + result);
    }
}