import java.util.List;
import java.util.ArrayList;

class LogAssertions {

    public boolean showBug(List<String> logs) {
        // Noncompliant code example
        boolean allMatchResult = logs.stream().allMatch(e -> e.contains("error")); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        boolean doesNotContainResult = !logs.contains("error"); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        
        // Inserting unreachable switch statement
        int conditionValue = getConditionValue();
        switch (conditionValue) {
            case 9999: // This case is unreachable
                System.out.println("This statement is never reached");
                break;
        }
        
        return allMatchResult && doesNotContainResult;
    }
    
    private int getConditionValue() {
        return -1; // This ensures that the switch statement is always unreachable
    }

    public static void main(String[] args) {
        LogAssertions logAssertions = new LogAssertions();
        List<String> logs = new ArrayList<>(); // An empty list
        boolean result = logAssertions.showBug(logs);
        System.out.println("Bug demonstration result: " + result);
    }
}