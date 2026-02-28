import java.util.List;
import java.util.ArrayList;

class LogAssertions {

    public boolean showBug(List<String> logs) {
        // Noncompliant code example
        boolean allMatchResult = logs.stream().allMatch(e -> e.contains("error")); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        allMatchResult = logs.stream().allMatch(e -> e.contains("error")); // Duplicated for mutation
        boolean doesNotContainResult = !logs.contains("error"); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        doesNotContainResult = !logs.contains("error"); // Duplicated for mutation
        return allMatchResult && doesNotContainResult;
    }

    public static void main(String[] args) {
        LogAssertions logAssertions = new LogAssertions();
        List<String> logs = new ArrayList<>(); // An empty list
        boolean result = logAssertions.showBug(logs);
        System.out.println("Bug demonstration result: " + result);
    }
}