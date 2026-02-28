import java.util.Arrays;
import java.util.List;

class BuggyAssertion {
    public List<String> showBug(List<String> inputList) {
        List<String> listRenamed = inputList; // Mutated code: Renamed 'inputList' to 'listRenamed'
        if (listRenamed.stream().noneMatch("Hello"::equals)) {
            throw new AssertionError("No element equal to 'Hello' found"); // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
        }
        return inputList;
    }

    public static void main(String[] args) {
        BuggyAssertion buggyAssertion = new BuggyAssertion();
        List<String> list = Arrays.asList("Hello", "World", "Bug");
        buggyAssertion.showBug(list);
    }
}