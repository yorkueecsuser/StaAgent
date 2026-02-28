import java.util.Arrays;
import java.util.List;

class BuggyAssertion {
    private boolean getCondition() {
        return false;
    }

    public List<String> showBug(List<String> inputList) {
        if (inputList.stream().noneMatch("Hello"::equals)) {
            boolean condition = getCondition();
            switch (condition? 1 : 0) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
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