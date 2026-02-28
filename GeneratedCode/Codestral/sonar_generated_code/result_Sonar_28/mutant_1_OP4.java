import java.util.Arrays;
import java.util.List;

class BuggyAssertion {
    public List<String> showBug(List<String> inputList) {
        if (inputList.stream().noneMatch("Hello"::equals)) {
            throw new AssertionError("No element equal to 'Hello' found");
        }

        // Inserted Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This branch is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable branch.");
        } else {
            // This is the else branch that should always be executed
            System.out.println("This is the else branch.");
        }

        return inputList;
    }

    private boolean getCondition() {
        // This method always returns false to make the if branch unreachable
        return false;
    }

    public static void main(String[] args) {
        BuggyAssertion buggyAssertion = new BuggyAssertion();
        List<String> list = Arrays.asList("Hello", "World", "Bug");
        buggyAssertion.showBug(list);
    }
}