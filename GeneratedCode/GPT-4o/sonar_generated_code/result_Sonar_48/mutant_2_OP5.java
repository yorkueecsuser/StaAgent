import java.util.List;
import java.util.ArrayList;

class LogAssertions {

    public boolean showBug(List<String> logs) {
        // Noncompliant code example
        boolean allMatchResult = logs.stream().allMatch(e -> e.contains("error")); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        boolean doesNotContainResult = !logs.contains("error"); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        return allMatchResult && doesNotContainResult;
    }

    public static void main(String[] args) {
        LogAssertions logAssertions = new LogAssertions();
        List<String> logs = new ArrayList<>(); // An empty list
        boolean result = logAssertions.showBug(logs);
        System.out.println("Bug demonstration result: " + result);

        // Unreachable switch statement mutant
        int unreachableValue = getUnreachableCondition(); // This method provides a non-final value
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                // Default case that is also unreachable
                System.out.println("This default case is unreachable too.");
        }
    }

    private static int getUnreachableCondition() {
        return -1; // Ensures the switch statement cases are unreachable
    }
}