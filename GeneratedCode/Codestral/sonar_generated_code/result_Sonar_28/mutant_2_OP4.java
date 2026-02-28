import java.util.Arrays;
import java.util.List;

class BuggyAssertion {
    public List<String> showBug(List<String> inputList) {
        if (inputList.stream().noneMatch("Hello"::equals)) {
            throw new AssertionError("No element equal to 'Hello' found");
        } else {
            boolean unreachableCondition = isUnreachable();
            if (unreachableCondition) {
                // This block is unreachable
                throw new RuntimeException("This code should never be executed");
            } else {
                // This block is reachable
            }
        }
        return inputList;
    }

    private boolean isUnreachable() {
        return false;
    }

    public static void main(String[] args) {
        BuggyAssertion buggyAssertion = new BuggyAssertion();
        List<String> list = Arrays.asList("Hello", "World", "Bug");
        buggyAssertion.showBug(list);
    }
}