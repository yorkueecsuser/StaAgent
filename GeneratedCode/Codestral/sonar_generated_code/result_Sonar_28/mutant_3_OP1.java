import java.util.Arrays;
import java.util.List;

class BuggyAssertion {
    public List<String> showBug(List<String> inputList) {
        int unusedVar; // Dead store mutant
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