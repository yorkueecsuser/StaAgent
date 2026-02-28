import java.util.Arrays;
import java.util.List;

class BuggyAssertion {
    private boolean getFalseCondition() {
        return false;
    }

    public List<String> showBug(List<String> inputList) {
        if (inputList.stream().noneMatch("Hello"::equals)) {
            throw new AssertionError("No element equal to 'Hello' found");
        }

        boolean falseCondition = getFalseCondition();
        int unreachableValue = 0;
        switch(unreachableValue) {
            case 1:
                if (falseCondition) {
                    System.out.println("This should not execute");
                }
                break;
            default:
                break;
        }

        return inputList;
    }

    public static void main(String[] args) {
        BuggyAssertion buggyAssertion = new BuggyAssertion();
        List<String> list = Arrays.asList("Hello", "World", "Bug");
        buggyAssertion.showBug(list);
    }
}