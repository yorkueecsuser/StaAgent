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

        // Insert unreachable for loop
        boolean conditionFor = getFalseCondition();
        for (int j = 0; conditionFor; j++) {
            // This block will never execute
            System.out.println("Unreachable loop");
        }

        return str; // This will return the integer converted to string
    }

    private boolean getFalseCondition() {
        return false; // Always returns false, making the for loop unreachable
    }
}