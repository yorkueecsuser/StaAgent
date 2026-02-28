import java.util.Arrays;
import java.util.List;

class BuggyAssertion {
    public List<String> showBug(List<String> inputList) {
        if (inputList.stream().noneMatch("Hello"::equals)) {
            throw new AssertionError("No element equal to 'Hello' found");
        }
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This loop is unreachable");
        }
        return inputList;
    }

    public static void main(String[] args) {
        BuggyAssertion buggyAssertion = new BuggyAssertion();
        List<String> list = Arrays.asList("Hello", "World", "Bug");
        buggyAssertion.showBug(list);
    }
}