import java.util.List;
import java.util.ArrayList;

class LogAssertions {

    public boolean showBug(List<String> logs) {
        // Noncompliant code example
        boolean allMatchResult = logs.stream().allMatch(e -> e.contains("error")); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        boolean doesNotContainResult = !logs.contains("error"); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness

        // Introducing an unreachable for loop
        boolean conditionFor = getCondition(); // Using non-final variable to avoid unreachable statement error
        for (int i = 0; conditionFor; i++) {
            // This block will never execute because conditionFor is always false
            System.out.println("This is an unreachable for loop.");
        }

        return allMatchResult && doesNotContainResult;
    }

    // Method to ensure dynamic condition for the unreachable loop
    private boolean getCondition() {
        return false; // This ensures the loop never executes
    }

    public static void main(String[] args) {
        LogAssertions logAssertions = new LogAssertions();
        List<String> logs = new ArrayList<>(); // An empty list
        boolean result = logAssertions.showBug(logs);
        System.out.println("Bug demonstration result: " + result);
    }
}