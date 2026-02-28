import java.util.List;
import java.util.ArrayList;

class LogAssertions {

    public boolean showBug(List<String> logs) {
        // Introduce a non-final variable to use in the condition
        boolean unreachableCondition = getUnreachableCondition();

        // Noncompliant code example
        boolean allMatchResult = logs.stream().allMatch(e -> e.contains("error")); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        boolean doesNotContainResult = !logs.contains("error"); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness

        // Unreachable if branch
        if (unreachableCondition) {
            System.out.println("This branch is unreachable.");
        }

        return allMatchResult && doesNotContainResult;
    }

    // Method to simulate a condition that always returns false but is not a compile-time constant
    private boolean getUnreachableCondition() {
        return false; // This is determined at runtime, not compile-time
    }

    public static void main(String[] args) {
        LogAssertions logAssertions = new LogAssertions();
        List<String> logs = new ArrayList<>(); // An empty list
        boolean result = logAssertions.showBug(logs);
        System.out.println("Bug demonstration result: " + result);
    }
}