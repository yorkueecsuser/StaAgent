import java.util.List;
import java.util.ArrayList;

class LogAssertions {

    public boolean showBug(List<String> logs) {
        // Noncompliant code example
        boolean allMatchResult = logs.stream().allMatch(e -> e.contains("error")); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        boolean doesNotContainResult = !logs.contains("error"); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness

        // Inserted unreachable for loop
        boolean conditionFor = getCondition(); // This simulates a runtime determined condition
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("This line will never be executed.");
        }

        return allMatchResult && doesNotContainResult;
    }

    // This method ensures the for loop condition is always false at runtime
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        LogAssertions logAssertions = new LogAssertions();
        List<String> logs = new ArrayList<>(); // An empty list
        boolean result = logAssertions.showBug(logs);
        System.out.println("Bug demonstration result: " + result);
    }
}