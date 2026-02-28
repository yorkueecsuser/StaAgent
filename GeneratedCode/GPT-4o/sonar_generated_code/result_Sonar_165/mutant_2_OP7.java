import java.util.List;

class BugDemonstration {

    public static void main(String[] args) {
        BugDemonstration bugDemo = new BugDemonstration();
        System.out.println(bugDemo.showBug("initial", 5, List.of("one", "two", "three")));
    }

    public String showBug(String str, int i, List<String> strings) {
        str = Integer.toString(i); // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored

        for (String s : strings) {
            s = "hello world"; // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
        }

        // Unreachable while loop mutation
        boolean conditionWhile = getCondition(); // Method simulating dynamic condition
        while (conditionWhile) {
            // This block is unreachable because conditionWhile is false
            System.out.println("This should never be printed.");
        }

        return str; // This will return the integer converted to string
    }

    // Simulate a dynamic condition
    private boolean getCondition() {
        return false; // Simulate that the condition is always false at runtime
    }
}