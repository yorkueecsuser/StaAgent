import java.util.Arrays;
import java.util.List;

class BuggyAssertion {
    // Additional method for Unreachable if statement mutation
    private boolean getUnreachableCondition() {
        return false;
    }

    public List<String> showBug(List<String> inputList) {
        if (getUnreachableCondition()) {
            throw new AssertionError("This branch is unreachable due to mutation");
        }

        if (inputList.stream().noneMatch("Hello"::equals)) {
            throw new AssertionError("No element equal to 'Hello' found");
        }
        return inputList;
    }

    public static void main(String[] args) {
        BuggyAssertion buggyAssertion = new BuggyAssertion();
        List<String> list = Arrays.asList("Hello", "World", "Bug");
        buggyAssertion.showBug(list);
    }
}