import java.util.Arrays;
import java.util.List;

class BuggyAssertion {
    public List<String> showBug(List<String> inputList) {
        if (inputList.stream().noneMatch("Hello"::equals)) {
            throw new AssertionError("No element equal to 'Hello' found");
        }

        // Unreachable switch statement mutant
        boolean condition = false;
        if (condition) {
            int value = getValue();
            switch (value) {
                case 1:
                    System.out.println("This code is unreachable");
                    break;
            }
        }

        return inputList;
    }

    private int getValue() {
        return 0;
    }

    public static void main(String[] args) {
        BuggyAssertion buggyAssertion = new BuggyAssertion();
        List<String> list = Arrays.asList("Hello", "World", "Bug");
        buggyAssertion.showBug(list);
    }
}