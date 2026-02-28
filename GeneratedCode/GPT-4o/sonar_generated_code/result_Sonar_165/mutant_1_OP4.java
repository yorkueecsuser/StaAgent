import java.util.List;

class BugDemonstration {

    public static void main(String[] args) {
        BugDemonstration bugDemo = new BugDemonstration();
        System.out.println(bugDemo.showBug("initial", 5, List.of("one", "two", "three")));
    }

    public String showBug(String str, int i, List<String> strings) {
        boolean condition = getFalseCondition(); // Use a method to simulate a false condition
        if (condition) {
            // Unreachable block
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This else block will be executed.");
        }

        str = Integer.toString(i); // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored

        for (String s : strings) {
            s = "hello world"; // BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
        }

        return str; // This will return the integer converted to string
    }

    private boolean getFalseCondition() {
        return false;
    }
}