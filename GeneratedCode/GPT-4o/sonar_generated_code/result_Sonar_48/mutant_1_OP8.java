import java.util.List;
import java.util.ArrayList;

class LogAssertions {

    public boolean showBug(List<String> logs) {
        // Noncompliant code example
        boolean allMatchResult = logs.stream().allMatch(e -> e.contains("error")); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        boolean doesNotContainResult = !logs.contains("error"); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        return allMatchResult && doesNotContainResult;
    }

    public boolean showBugMutant(List<String> logs) {
        // Noncompliant code example with renamed variable
        boolean b = logs.stream().allMatch(e -> e.contains("error")); // Renamed allMatchResult to b
        boolean doesNotContainResult = !logs.contains("error"); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        return b && doesNotContainResult;
    }

    public static void main(String[] args) {
        LogAssertions logAssertions = new LogAssertions();
        List<String> logs = new ArrayList<>(); // An empty list
        boolean result = logAssertions.showBug(logs);
        System.out.println("Bug demonstration result: " + result);

        boolean mutantResult = logAssertions.showBugMutant(logs);
        System.out.println("Mutant bug demonstration result: " + mutantResult);
    }
}