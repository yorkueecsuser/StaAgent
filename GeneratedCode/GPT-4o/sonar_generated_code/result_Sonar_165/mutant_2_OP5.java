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

        // Introduce an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This switch case will never execute");
                break;
            default:
                // This default can have a non-executable statement to avoid unreachable statement errors.
                System.out.println("This default case is unreachable");
                break;
        }

        return str; // This will return the integer converted to string
    }

    // This method provides a runtime-determined value, ensuring the switch statement is syntactically correct
    private int getUnreachableValue() {
        return 999; // Ensure this value does not match any case in the switch
    }
}