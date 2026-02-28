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

        // Introducing an unreachable switch by ensuring the condition evaluates to a value not covered by any case.
        int unreachableSwitchCondition = getUnreachableCondition();
        switch (unreachableSwitchCondition) {
            case 100: // Assuming no logic to handle this case, making it unreachable
                System.out.println("This is unreachable.");
                break;
        }

        return str; // This will return the integer converted to string
    }

    // A method to simulate a non-final variable for the switch statement
    private int getUnreachableCondition() {
        return 100; // This value does not affect the program's logic and makes the case unreachable
    }
}