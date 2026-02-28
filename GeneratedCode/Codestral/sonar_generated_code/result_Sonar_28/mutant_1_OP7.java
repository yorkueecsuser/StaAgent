import java.util.Arrays;
import java.util.List;

class BuggyAssertion {
    public List<String> showBug(List<String> inputList) {
        if (inputList.stream().noneMatch("Hello"::equals)) {
            throw new AssertionError("No element equal to 'Hello' found");
        }
        // Inserted unreachable while loop
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This code will never be executed
        }
        return inputList;
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        BuggyAssertion buggyAssertion = new BuggyAssertion();
        List<String> list = Arrays.asList("Hello", "World", "Bug");
        buggyAssertion.showBug(list);
    }
}