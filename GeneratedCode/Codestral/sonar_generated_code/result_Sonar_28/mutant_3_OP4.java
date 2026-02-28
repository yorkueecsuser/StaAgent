import java.util.Arrays;
import java.util.List;

class BuggyAssertion {
    public List<String> showBug(List<String> inputList) {
        boolean unreachableCondition = falseCondition();
        if (unreachableCondition) {
            // Unreachable code branch
            System.out.println("This code will never be executed");
        } else {
            if (inputList.stream().noneMatch("Hello"::equals)) {
                throw new AssertionError("No element equal to 'Hello' found");
            }
        }
        return inputList;
    }

    private boolean falseCondition() {
        // This method always returns false, making the if-else branch unreachable
        return false;
    }

    public static void main(String[] args) {
        BuggyAssertion buggyAssertion = new BuggyAssertion();
        List<String> list = Arrays.asList("Hello", "World", "Bug");
        buggyAssertion.showBug(list);
    }
}