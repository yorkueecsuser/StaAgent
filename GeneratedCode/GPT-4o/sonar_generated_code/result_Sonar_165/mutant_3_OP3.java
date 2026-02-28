import java.util.List;

class BugDemonstration {

    public static void main(String[] args) {
        BugDemonstration bugDemo = new BugDemonstration();
        System.out.println(bugDemo.showBug("initial", 5, List.of("one", "two", "three")));
    }

    public String showBug(String str, int i, List<String> strings) {
        str = Integer.toString(i); // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored

        // Inserted unreachable if branch
        boolean isAlwaysFalse = getFalseCondition();
        if (isAlwaysFalse) {
            System.out.println("This code is unreachable.");
        }

        for (String s : strings) {
            s = "hello world"; // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
        }

        return str; // This will return the integer converted to string
    }

    // Method to ensure the unreachable if statement adheres to guidelines
    private boolean getFalseCondition() {
        return false;
    }
}