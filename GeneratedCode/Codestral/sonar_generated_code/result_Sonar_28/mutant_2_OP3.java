import java.util.Arrays;
import java.util.List;

class BuggyAssertion {
    public List<String> showBug(List<String> inputList) {
        if (inputList.stream().noneMatch("Hello"::equals)) {
            throw new AssertionError("No element equal to 'Hello' found");
        }

        // Unreachable if statement mutant
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This is an unreachable statement");
        }

        return inputList;
    }

    private boolean getUnreachableCondition() {
        // This condition is always false to make the if block unreachable
        return "Hello".equals("World");
    }

    public static void main(String[] args) {
        BuggyAssertion buggyAssertion = new BuggyAssertion();
        List<String> list = Arrays.asList("Hello", "World", "Bug");
        buggyAssertion.showBug(list);
    }
}