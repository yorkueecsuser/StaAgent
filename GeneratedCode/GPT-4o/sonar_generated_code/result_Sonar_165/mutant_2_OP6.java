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
        
        // Unreachable for loop mutation
        boolean conditionFor = getUnreachableCondition();
        for (int j = 0; conditionFor; j++) {
            System.out.println("This is an unreachable for loop.");
        }

        return str; // This will return the integer converted to string
    }

    // An additional method to provide a runtime condition for the unreachable for loop.
    private boolean getUnreachableCondition() {
        return false; // This is not a constant at compile time, ensuring no unreachable statement error
    }
}