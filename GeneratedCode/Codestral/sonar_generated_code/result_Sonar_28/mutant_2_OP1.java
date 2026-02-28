import java.util.Arrays;
import java.util.List;
import java.util.Random;

class BuggyAssertion {
    public List<String> showBug(List<String> inputList) {
        int unusedVariable; // Dead store mutation
        if (inputList.stream().noneMatch("Hello"::equals)) {
            Random random = new Random();
            unusedVariable = random.nextInt(100); // Using the dead store variable
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