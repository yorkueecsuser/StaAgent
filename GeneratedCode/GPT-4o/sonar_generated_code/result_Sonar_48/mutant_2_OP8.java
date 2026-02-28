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
    }
}

// Mutant code with renaming mutation operator applied

class LogAssertionsMutant {

    public boolean showBug(List<String> a) { // 'logs' renamed to 'a'
        // Noncompliant code example
        boolean allMatchResult = a.stream().allMatch(e -> e.contains("error")); // 'logs' replaced by 'a'
        boolean doesNotContainResult = !a.contains("error"); // 'logs' replaced by 'a'
        return allMatchResult && doesNotContainResult;
    }

    public static void main(String[] args) {
        LogAssertionsMutant logAssertionsMutant = new LogAssertionsMutant();
        List<String> a = new ArrayList<>(); // 'logs' renamed to 'a'
        boolean result = logAssertionsMutant.showBug(a); // 'logs' replaced by 'a'
        System.out.println("Bug demonstration result (mutant): " + result);
    }
}