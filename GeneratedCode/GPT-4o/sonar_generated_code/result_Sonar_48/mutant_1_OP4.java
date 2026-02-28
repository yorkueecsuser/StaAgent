import java.util.List;
import java.util.ArrayList;

class LogAssertions {

    public boolean showBug(List<String> logs) {
        // Noncompliant code example
        boolean allMatchResult = logs.stream().allMatch(e -> e.contains("error")); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        boolean doesNotContainResult = !logs.contains("error"); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        
        // Introduce an unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This block is unreachable");
        } else {
            System.out.println("This else block is also unreachable");
        }
        
        return allMatchResult && doesNotContainResult;
    }

    // Method to simulate a condition that is always false
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        LogAssertions logAssertions = new LogAssertions();
        List<String> logs = new ArrayList<>(); // An empty list
        boolean result = logAssertions.showBug(logs);
        System.out.println("Bug demonstration result: " + result);
    }
}